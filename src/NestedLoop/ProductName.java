package NestedLoop;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Product {
    String name, category;
    double price;
    // constructor, getters
    
    public Product (String name, String category,double price) {
    	this.name= name;
    	this.category =category;
    	this.price =price;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
}
public class ProductName {

	public static void main(String [] args) {
		List<Product> products = Arrays.asList(
			    new Product("Laptop", "Electronics", 1200),
			    new Product("Mouse", "Electronics", 25),
			    new Product("Desk", "Furniture", 500),
			    new Product("Phone", "Electronics", 800),
			    new Product("Chair", "Furniture", 150)
			);

			double threshold = 200;
			
			
			List<String> res =products.stream()
			.filter(n -> n.getPrice() > threshold)
			.map(Product:: getName)
			.distinct()
			.sorted()
			
			.collect(Collectors.toList());
			
			System.out.println(res);
	}
}
