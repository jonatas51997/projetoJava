package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensao;

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		
		Pensao[] vect = new Pensao [10];
		
		System.out.println("Quantos quartos serão alugados?");
		
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
		System.out.println();
		System.out.println("Rent #" + i + ":");
		System.out.print("Qual é o seu nome");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Qual é o seu email");
		String email = sc.nextLine();	
		System.out.println("Qual é o seu quarto");
		int quarto = sc.nextInt();
		vect [quarto] = new Pensao(nome, email);
		
		}
		
		System.out.println();
		System.out.println("busy rooms");
		for (int i=0;i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect [i]);
			}
			
		}
		
		
		
		sc.close();
		
	}

}
