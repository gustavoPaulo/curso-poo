package com.poo.enums;

public class Principal {

	public static void main(String[] args) {

		Banheiro banheiro = new Banheiro();
		
		banheiro.setNumero(2);
		banheiro.setDesignacao(Designacao.TRANSEXUAL);
		
		System.out.println("O banheiro n�mero " + banheiro.getNumero() + 
						   " com a designa��o " + banheiro.getDesignacao().getDesignacao() + 
						   " est� disponivel agora!");
	}

}
