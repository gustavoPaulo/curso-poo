package com.poo.curso.stream.modelo;

public class Fatura {

	private String email;
	private double valor;
	
	
	public Fatura(String email, double valor) {
		super();
		this.email = email;
		this.valor = valor;
	}

	public boolean estaEmRisco() {
		return valor >= 250 ? true : false; 
	}
	
	public void imprimir() {
		System.out.println("Atenção! Fatura com valor de risco. (Maior que R$250,00): R$" + this.valor);
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
