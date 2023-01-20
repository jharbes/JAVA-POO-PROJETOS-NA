package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import entities.Locacao;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date retirada=new Date();
		Date retorno=new Date();

		System.out.println("Entre com os dados do aluguel");
		
		System.out.print("Modelo do carro: ");
		String nomeCarro = teclado.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		try {
			retirada=sdf.parse(teclado.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm: ");
		try {
			retorno=sdf.parse(teclado.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Entre com o preco por hora: ");
		float precoPorHora=teclado.nextFloat();
		
		System.out.print("Entre com o preco por dia: ");
		float precoPorDia=teclado.nextFloat();
		
		Locacao locacao=new Locacao(nomeCarro, retirada, retorno, precoPorHora, precoPorDia);
		
		long duracao=retorno.getTime()-retirada.getTime();
		
		TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(duracao, TimeUnit.MILLISECONDS);
        System.out.println("The difference in days is : "+diffrence);

	}

}
