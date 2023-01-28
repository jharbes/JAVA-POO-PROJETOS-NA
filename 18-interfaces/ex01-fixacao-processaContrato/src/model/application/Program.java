package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		Integer numeroContrato = teclado.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(teclado.nextLine(), fmt);
		System.out.print("Entre com o número de parcelas: ");
		Integer numeroMesesContrato = teclado.nextInt();

		System.out.println("Parcelas:");

		teclado.close();
	}

}
