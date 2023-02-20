package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\Jorge\\Desktop\\Udemy\\JAVA-POO-PROJETOS-NA\\20-programacao-funcional-expressoes-lambda\\inputFile.csv";

		List<Produto> listaProdutos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String params[] = line.split(",");

				listaProdutos.add(new Produto(params[0], Double.parseDouble(params[1])));

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		Double media = listaProdutos.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y)
				/ listaProdutos.size();

		System.out.print("Average price: ");
		System.out.println(String.format("%.2f", media));
	}

}
