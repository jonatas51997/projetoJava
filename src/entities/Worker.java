package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	 
	private String nome;
	private WorkerLevel level;
	private double salario;
	
	
	private Departament departament;
	private List <Contrato> contratos = new ArrayList<>();
	
	
	public Worker () {
		
	}
	
	
	public Worker (String nome, WorkerLevel level, double salario, Departament departament) {
		this.nome = nome;
		this.level = level;
		this.salario = salario;
		this.departament = departament;
		
				
	}
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}


	public List<Contrato> getContratos() {
		return contratos;
	}

	
	public void addContract (Contrato Contratos ) {
		contratos.add(Contratos);
	}
	
	public void removeContratos(Contrato Contratos) {
		contratos.remove(Contratos);
	}
	
	public double income (int year, int month) {
		double sum = salario;
		Calendar cal = Calendar.getInstance();
		
		for (Contrato c : contratos) {
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if (year == c_year && month == c_month) {
			sum += c.totalValue();
			}
		}
		return sum;
		
		
		}
	}
	
	

