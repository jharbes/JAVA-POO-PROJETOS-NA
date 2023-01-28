package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private BrazilTaxService brazilTaxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxService = brazilTaxService;
	}

	public void processInvoice(CarRental carRental) {

		// calculo da duracao de tempo entre dois objetos LocalDateTime, sendo o
		// primeiro o primeiro momento e o segundo argumento o segundo momento em
		// minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;

		double basicPayment;

		if (hours <= 12) {
			basicPayment = this.pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = this.pricePerDay * Math.ceil(hours / 24);
		}

		carRental.setInvoice(new Invoice(basicPayment, this.brazilTaxService.tax(basicPayment)));
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public BrazilTaxService getBrazilTaxService() {
		return brazilTaxService;
	}

	public void setBrazilTaxService(BrazilTaxService brazilTaxService) {
		this.brazilTaxService = brazilTaxService;
	}

}
