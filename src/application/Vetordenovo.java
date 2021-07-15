package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetorp;

public class Vetordenovo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		Vetorp[] vect = new Vetorp[n];
		
		for (int i=0; i < n; i++) {
			sc.nextLine();
			String nome = sc.next();
			double preço = sc.nextDouble();
			vect[i] = new Vetorp (nome, preço);
			
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum+= vect[i].getPreço();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
		
		
	}

}
