package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// primeira maneira:
		// list.sort(new MyComparator());

		// segunda maneira (usando sintaxe de classe anonima):
		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { // TODO Auto-generated
		 * method stub return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); } };
		 * 
		 * list.sort(comp);
		 */

		// terceira maneira (usando arrow function)
		/*
		 * Comparator<Product> comp = (p1,p2) -> { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */
		
		/*
		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		*/
		
		// como a implementacao da funcao tem apenas uma linha nos podemos dispensar as
		// chaves acima e dispensar o return utilizando a expressao resumida abaixo:
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
