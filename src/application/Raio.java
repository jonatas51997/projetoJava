package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Raio {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volum: %.2f%n ", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		
		
		sc.close();

	}
	
	
}
