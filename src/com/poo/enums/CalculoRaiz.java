package com.poo.enums;

public class CalculoRaiz {

	private int valor;

	
	public void calculo(int numero) {
		
		this.valor = numero;
		
		int result = (int) Math.sqrt(valor);
		
		System.out.println("A reaiz de " + valor + " é: " + result + ".");
	}
}
