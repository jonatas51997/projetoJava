package entities;

public class Funcionario {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary -= Tax;
	}
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name+ ", $ "+ String.format("%.2f", NetSalary());
}
	
}