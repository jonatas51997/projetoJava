package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Listando;

;



public class Listas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		List<Listando> list = new ArrayList<>();
		
		
		System.out.println("quantos funcionarios serão registrados ?");
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			System.out.println("funcionario #" +(i + 1 + ":"));
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.print("Qual é o seu nome?");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Qual é o seu salario?");
			double salario = sc.nextDouble();
			
			Listando listando = new Listando (id, nome, salario);
			
			list.add(listando);
		}
		
		System.out.println("Enther the empolyee id that will have salary increase");
		int idsalary = sc.nextInt();
		Integer pos = position (list, idsalary);
		if (pos == null) {
			System.out.println(" esse id nao existe");
		}
		
		else {
			System.out.println("enther the percentage");
			double percent = sc.nextDouble();
			list.get(pos).IncreaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of funcionarios");
		for (Listando listando : list) {
			System.out.println(listando);
		}
		
		sc.close();
		
		
		
			
		
		}
		
	public static Integer position(List<Listando> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId()==id) {
				
				return i;
			}
				
		}
		return null;
	}
	
	
	}


