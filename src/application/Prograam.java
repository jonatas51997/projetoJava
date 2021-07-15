package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Prograam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter prodct data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
	    Product product = new Product(name, price, quantity);
		
	    product.setName("Computer");
	    System.out.println("Updated name: " + product.getName());
	    product.setPrice(1200.00);
	    System.out.println("updated price: " + product.getPrice());
	    
		System.out.println();
		System.out.print("Product data: " + product);
		
		
		System.out.println();
		System.out.print("Ententhe number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		
		System.out.println();
		System.out.print("Ententhe number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		
		
		sc.close();
	}

}
