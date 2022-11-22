package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter account data");
		
		try {
			System.out.print("Number: ");
			Integer number = teclado.nextInt();
	
			System.out.print("Holder: ");
			teclado.nextLine();
			String holder = teclado.nextLine();
	
			System.out.print("Initial balance: ");
			Double initialBalance = teclado.nextDouble();
	
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = teclado.nextDouble();
	
			System.out.print("\nEnter amount for withdraw: ");
			Double withdrawAmount = teclado.nextDouble();
			
			Account c1=new Account(number, holder, initialBalance, withdrawLimit);
			
			c1.deposit(500.0);
			
			System.out.println(c1);
		}
		catch (Exception e) {
			System.out.println("Error in accessing account: " + e);
		}
		
		
		teclado.close();
	}
}
