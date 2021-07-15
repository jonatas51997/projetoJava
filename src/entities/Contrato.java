package entities;

import java.util.Date;

public class Contrato {
	
	private Date date;
	private double valor;
	private Integer horas;
	
	public Contrato (Date date, double valor, Integer horas) {
		this.date = date;
		this.valor = valor;
		this.horas = horas;
	}
	
	public Date getDate () {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getValor () {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getHoras () {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double totalValue () {
		return valor * horas;
	}
}
