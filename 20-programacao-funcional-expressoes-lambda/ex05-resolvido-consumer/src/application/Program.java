package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		// 1a versao: com implementacao da interface 
		// list.forEach(new PriceUpdate());
		
		// 2ª versao: method com metodo estatico 
		list.forEach(Product::staticPriceUpdate);
		
		// usando um reference method para o println
		list.forEach(System.out::println);
	}

}
