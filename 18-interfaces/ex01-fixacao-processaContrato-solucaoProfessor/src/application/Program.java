package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int number = teclado.nextInt();

		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(teclado.next(), fmt);

		System.out.print("Valor do contrato: ");
		double totalValue = teclado.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = teclado.nextInt();

		teclado.close();
	}

}
