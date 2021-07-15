package entities;

public class Cobaia {
	
	public String nome;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary -= Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100;
		
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", NetSalary());
	}
}
