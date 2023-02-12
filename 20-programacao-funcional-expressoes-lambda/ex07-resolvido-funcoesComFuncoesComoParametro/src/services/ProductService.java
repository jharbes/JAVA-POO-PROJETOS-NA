package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	// o parametro Predicate<Product> criteria permite receber um parametro para o
	// if generico, fazendo com que a funcao fique aberta a mais funcionalidades de
	// condicoes do que aquela prevista inicialmente, isso permite alteracoes nas
	// condicoes do if sem precisar abrir o codigo
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p))
				sum += p.getPrice();
		}
		return sum;
	}
}
