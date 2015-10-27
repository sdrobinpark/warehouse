package models;

import java.util.HashSet;
import java.util.Set;

public class Product {
	public Long ean;
	public String name;
	public String description;

	private static Set<Product> products = new HashSet<>();

	static {
		products.add(new Product(1111L, "Paperclips 1", "Paperclips description 1"));
		products.add(new Product(2222L, "Paperclips 2", "Paperclips description 2"));
		products.add(new Product(3333L, "Paperclips 3", "Paperclips description 3"));
		products.add(new Product(4444L, "Paperclips 4", "Paperclips description 4"));
		products.add(new Product(5555L, "Paperclips 5", "Paperclips description 5"));
	}
	
	public Product() {}
	public Product(Long ean, String name, String description) {
		this.ean = ean;
		this.name = name;
		this.description = description;
	}
	public String toString() {
		return String.format("%s - %s", ean, name);
	}
}
