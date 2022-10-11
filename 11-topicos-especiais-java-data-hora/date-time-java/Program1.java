package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // data neste momento local
		
		LocalDateTime d02 = LocalDateTime.now(); // data e hora neste momento local
		
		Instant d03 = Instant.now(); // data e hora neste momento padrao GMT (letra Z no final)
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // convertendo texto no formato ISO8601 para data no Java
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // convertendo texto no formato ISO8601 para data, hora no Java
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // idem ao anterior, mas agora no horario GMT (final Z)
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Aqui ele vai instanciar o horário de acordo com o GMT, ou seja, ele entende que o horario (01:30) está tres horas a menos que o indicado no fuso (-03:00), tendo como resultado o horario de 04:30
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		
		// Ao imprimir os objetos o Java chama automaticamente o método toString(), por isso ele se torna opcional, o texto vem no formato ISO8601.
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}