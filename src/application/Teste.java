package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cobaia;

public class Teste {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Cobaia cobaia = new Cobaia();
		
		System.out.print("Digite o seu nome");
		cobaia.nome = sc.nextLine();
		System.out.println();
		
		System.out.print("Digite o seu salario");
		cobaia.GrossSalary = sc.nextDouble();
		System.out.println();
		
		System.out.print("Digite a sua taxa");
		cobaia.Tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Cobaia " + cobaia);
		System.out.println();
		
		System.out.print("qual é a porcentagem que voce quer incluir no salario?");
		double percentage = sc.nextDouble();
		
		System.out.println();
		System.out.println("upadate data: " + cobaia);
		sc.close();
		
		
				
		

	}

}
