package entities;

public class Vetorp {
	private String nome;
	private double pre�o;
	
	public Vetorp (String nome, double pre�o) {
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	public String getNome (){
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getPre�o () {
		return pre�o;
	}
	
	public void setPre�o (double pre�o) {
		this.pre�o = pre�o;
	}
	
}