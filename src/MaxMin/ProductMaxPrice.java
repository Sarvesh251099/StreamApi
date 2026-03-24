package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Product {
    String name;
    String category;
    double price;
    int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getPrice() {
    	return price;
    }

    public String getName() {
    	return name;
    }
    
}
public class ProductMaxPrice {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product("Laptop",   "Electronics", 1500, 10),
			    new Product("Phone",    "Electronics", 800,  25),
			    new Product("Desk",     "Furniture",   500,  15),
			    new Product("TV",       "Electronics", 1500, 5),
			    new Product("Chair",    "Furniture",   300,  20)
			);
		
//		return product name with max value
//		String res =products.stream()
//		.max(Comparator.comparing(Product::getPrice))
//		.map(n -> n.getName())
//		.orElse(null);
//		
		
		Double res = products.stream()
		.mapToDouble(Product::getPrice)
		
		.max()
		.orElse(0);
		System.out.println(res);
	}
}
