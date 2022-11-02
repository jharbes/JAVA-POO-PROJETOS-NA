package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		Integer numProdutos=teclado.nextInt();
		
		for (int i=1;i<=numProdutos;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Name: ");
			String nomeProduto=teclado.nextLine();
			System.out.print("Price: ");
			Double precoProduto=teclado.nextDouble();
		}
		teclado.close();
	}

}
