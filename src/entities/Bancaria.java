package entities;

public class Bancaria {

private int numero;
private String nome;
private double saldo;

public Bancaria (int numero, String nome) {
	this.numero = numero;
	this.nome = nome;
}


public Bancaria (int numero, String nome, double saldoinicial) {
	this.numero = numero;
	this.nome = nome;
	addDeposito(saldoinicial);
}

public int getNumero() {
	return numero;
}

public void setNome (String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public double getSaldo () {
	return saldo;
}

 public void addDeposito (double quantia) {
	 saldo += quantia;
 }
 
 public void addSaque (double quantia) {
	saldo -= quantia + 5.0;
 }
 
 public String toString () {
	 return "Bancaria "
			 + numero
			 + ", saldo: "
			 + nome
			 +", Saldo: $"
			 + String.format("%.2f", saldo);
 }
 
}
