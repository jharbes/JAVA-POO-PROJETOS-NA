package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista
		 * contendo os nomes dos produtos em caixa alta.
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// a funcao map pega uma colecao de valores (no caso funciona apenas com a
		// stream) e aplica uma funcao a cada um desses items de uma stream, nesse
		// exemplo primeiro convertemos de lista para stream para que assim possamos
		// utilizar a funcao map
		List<String> namesUpperCase = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		// duas maneiras de imprimir a lista com forEach
		namesUpperCase.forEach(p -> System.out.println(p));
		System.out.println();
		namesUpperCase.forEach(System.out::println);

	}

}
