package entities;

public class Listando {
	private int id;
	private String nome;
	private double salario;
	
	
	public Listando (int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getSalario () {
		return salario;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	
	public void IncreaseSalary (double percentage) {
		salario += salario * percentage; 
	}
	
	public String toString () {
		return id + " , " + nome + ", " + String.format("%.2f", salario);
	}
}
