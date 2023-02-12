package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// metodo estatico trabalha com o produto que sera passado como argumento, logo
	// deve receber um argumento "p" para que seja trabalhado
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	// por ser um metodo nao estatico vai trabalhar com o proprio produto onde se
	// encontra, por isso nao precisa de argumento, pois sera o proprio produto em
	// si
	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100.0;
	}

	// recebe o produto "p" por ser um metodo estatico, ou seja, trata com o
	// parametro recebido e nao o proprio paramentro
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}
}
