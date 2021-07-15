package application;

import java.util.Locale;
import java.util.Scanner;

public class Testedetd {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		String jon = "vanessa";
		int idade = 24;
		double renda = 223.4;
		
		
		System.out.printf("%s nao é tanto enquanto isso o %d tem o %.2f%n", jon, idade, renda);
		
		
		
		
		sc.close();
		
		
		}
		
	}


