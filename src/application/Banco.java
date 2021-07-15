package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bancaria;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Bancaria bancaria;
		
		System.out.print("enther account number");
		int numero = sc.nextInt();
		System.out.print("Enther account holder");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Is there na initial deposit y/n");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldoinicial = sc.nextDouble();
			bancaria = new Bancaria(numero, nome, saldoinicial);
		}
		else {
			bancaria = new Bancaria(numero, nome);
		}
		
		System.out.println();
		System.out.println("Bancaria data: ");
		System.out.println(bancaria);
		
		System.out.println();
		System.out.println("enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bancaria.addDeposito(depositValue);
		System.out.println("updated bancaria data :");
		System.out.println(bancaria);
		
		System.out.println();
		System.out.println("enter a saque value: ");
		double saqueValue = sc.nextDouble();
		bancaria.addSaque(saqueValue);
		System.out.println("updated bancaria data :");
		System.out.println(bancaria);
		
		sc.close();
	}

}
