package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Name");
		funcionario.name = sc.nextLine();
		System.out.println("Groos salary");
		funcionario.GrossSalary = sc.nextDouble();
		System.out.println("TAX");
		funcionario.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Funcionario: " + funcionario);
		
		System.out.println();
		System.out.print("enther the grosssalary funcionario: ");
		funcionario.GrossSalary = sc.nextDouble();
		System.out.print("enther the taxa funcionario: ");
		funcionario.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Funcionario: " + funcionario);
		System.out.println();
		System.out.print("witche the percentage the money");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: "+ funcionario);
		sc.close();
		
	}

}
