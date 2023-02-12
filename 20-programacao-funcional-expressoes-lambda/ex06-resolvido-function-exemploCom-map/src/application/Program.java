package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

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
		// 1a versao: implementacao da interface
		// List<String> namesUpperCase = list.stream().map(new
		// UpperCaseName()).collect(Collectors.toList());

		// 2a versao: reference method com metodo estatico
		// List<String> namesUpperCase =
		// list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		// 3a versao: reference method com metodo nao estatico
		// List<String> namesUpperCase =
		// list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

		// 4a versao: expressao lambda declarada
		Function<Product, String> function = p -> p.getName().toUpperCase();
		List<String> namesUpperCase = list.stream().map(function).collect(Collectors.toList());

		// duas maneiras de imprimir a lista com forEach
		namesUpperCase.forEach(p -> System.out.println(p));
		System.out.println();
		namesUpperCase.forEach(System.out::println);

	}

}
