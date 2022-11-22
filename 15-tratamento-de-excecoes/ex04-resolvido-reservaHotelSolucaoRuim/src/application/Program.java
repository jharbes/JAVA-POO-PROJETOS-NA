package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = teclado.nextInt();

		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(teclado.next());

		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(teclado.next());

		Reservation r1 = new Reservation();

		if (!checkout.after(checkin))
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		else {
			r1.setRoomNumber(roomNumber);
			r1.updateDates(checkin, checkout);
			System.out.println(r1);

			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(teclado.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(teclado.next());

			String error=r1.updateDates(checkin, checkout);
			
			if (error!=null) 
				System.out.println("Error in reservation: "+error);
			else
				System.out.println(r1);
			
		}

		teclado.close();
	}

}
