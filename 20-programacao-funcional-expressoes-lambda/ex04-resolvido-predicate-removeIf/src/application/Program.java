package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

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
		
		/* Primeira versao: implementacao da interface
		list.removeIf(new ProductPredicate());
		*/
		
		list.removeIf(Product::staticProductPredicate);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
