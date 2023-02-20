package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String path = "C:\\Users\\Jorge\\Desktop\\Udemy\\JAVA-POO-PROJETOS-NA\\20-programacao-funcional-expressoes-lambda\\inputFile2.csv";

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				String params[] = line.split(",");
				listaFuncionarios.add(new Funcionario(params[0], params[1], Double.parseDouble(params[2])));

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.print("Enter salary: ");
		Double salarioReferencia = teclado.nextDouble();

		List<String> listaEmailFiltrados = listaFuncionarios.stream().filter(p -> p.getSalario() > salarioReferencia)
				.map(p -> p.getEmail()).sorted().collect(Collectors.toList());

		System.out.println("Email of people whose salary is more than 2000.00:");
		listaEmailFiltrados.forEach(System.out::println);

		Double somatorioSalarios = listaFuncionarios.stream().filter(p -> p.getNome().charAt(0) == 'M')
				.map(p -> p.getSalario()).reduce(0.0, (x, y) -> x + y);

		System.out.println(
				"Sum of salary of people whose name starts with 'M': " + String.format("%.2f", somatorioSalarios));
	}

}
