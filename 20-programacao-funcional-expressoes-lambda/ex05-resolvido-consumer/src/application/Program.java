package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

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
		// list.forEach(Product::staticPriceUpdate);

		// 3ª versao: method com metodo nao estatico
		// list.forEach(Product::nonStaticPriceUpdate);

		// 4ª versao: expressao lambda declarada
		// double factor = 1.1; // utilizamos a entrada com o valor de modo a diminuir o acoplamento permitindo
								// que o valor chegue ao programa sem manutencao no codigo
		// Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		// list.forEach(cons);
		
		// 5ª versao: expressao lambda inline
		double factor = 1.1; // conforme acima para reduzir acoplamento
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		

		// usando um reference method para o println
		list.forEach(System.out::println);
	}

}
