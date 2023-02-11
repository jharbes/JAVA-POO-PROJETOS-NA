package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// na programacao funcional podemos passar uma funcao como argumento de outra
		// funcao, o que significa dizer que a funcao eh um objeto de primeira classe ou
		// primeira ordem
		list.sort(Program::compareProducts);

		list.forEach(System.out::println);
	}

}
