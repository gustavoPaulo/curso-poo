package com.poo.javadoc;

public class AdiantamentoViagem {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Gustavo da Silva Paulo", 2543.00);
		
		System.out.println("O adiantamento para viagem sera de: R$" + funcionario1.adiantamentoViagem(3, true));
	}
}
