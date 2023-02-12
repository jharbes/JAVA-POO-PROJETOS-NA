package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
		 * preços somente dos produtos cujo nome começa com "T".
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService productService = new ProductService();

		// a funcao filteredSum recebe a condicao externamente facilitando multiplas
		// condicoes a serem analisadas sem a necessidade de abrir o codigo e alterar
		// para cada uma delas
		double sum = productService.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
