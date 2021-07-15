package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Principio {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("DD/MM/YYYY");
		
		System.out.print("Enter departaments name :");
		String departament = sc.nextLine();
		System.out.println("Enter work date");
		System.out.print("NOME");
		String workername = sc.nextLine();
		System.out.print("level");
		String worklevel = sc.nextLine();
		System.out.print("salario");
		double salario = sc.nextDouble();
		Worker worker = new Worker(workername, WorkerLevel.valueOf(worklevel),salario, new Departament(departament));
		
		System.out.print("How many contracts to this worker ?");
		int n = sc.nextInt();
		
		for (int i=1; i < n; i++) {
			System.out.print("Enther contract number #" + i + "data:");
			System.out.print("Date (DD/MM/YYYY) :");
			Date date = sdf.parse(sc.next());
			System.out.print("valor por hour");
			double valor = sc.nextDouble();
			System.out.print("duration (hours): ");
			int horas = sc.nextInt();
			Contrato contract = new Contrato(date, valor, horas);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("enter the mont and year to calculate income (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getNome());
		System.out.println("Departament: " + worker.getDepartament().getNome());
		
		System.out.println("iNCOME FOR " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
		
	}

}
