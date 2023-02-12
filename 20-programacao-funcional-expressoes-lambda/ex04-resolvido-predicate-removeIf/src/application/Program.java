package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Primeira versao: implementacao da interface
		 */

		// list.removeIf(new ProductPredicate());

		/*
		 * Segunda versao: Reference method com método estático, o argumento abaixo
		 * significa rodar o metodo em questao (staticProductPredicate) para cada um dos
		 * produtos da lista
		 */

		// list.removeIf(Product::staticProductPredicate);

		/*
		 * Terceira versao: Reference method com metodo nao estatico, metodo na classe
		 * Product tem seu resultado ligeiramente diferente
		 */

		// list.removeIf(Product::nonStaticProductPredicate);

		// implementacao bastante interessante pois gera baixo acomplamento, poderiamos
		// ter colocado o valor 100.0 direto na expressao lambda, no entanto podemos tb
		// colocar ela em outra variavel, no caso "min", fazendo com que ela possa ser
		// recebida no decorrer do programa evitando modificacoes em codigo para
		// alteracoes de valores
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
