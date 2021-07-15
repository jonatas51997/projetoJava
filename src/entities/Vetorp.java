package entities;

public class Vetorp {
	private String nome;
	private double preço;
	
	public Vetorp (String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	
	public String getNome (){
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getPreço () {
		return preço;
	}
	
	public void setPreço (double preço) {
		this.preço = preço;
	}
	
}
