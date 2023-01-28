package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService() {
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double porMes = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			Installment installment = new Installment(contract.getDate().plusMonths(i), null);
			installment.setAmount(porMes + this.onlinePaymentService.paymentFee(porMes)
					+ this.onlinePaymentService.interest(porMes, months));
		}
	}
}
