package com.poo.enums;

public class Principal {

	public static void main(String[] args) {

		Banheiro banheiro = new Banheiro();
		
		banheiro.setNumero(2);
		banheiro.setDesignacao(Designacao.TRANSEXUAL);
		
		System.out.println("O banheiro número " + banheiro.getNumero() + 
						   " com a designação " + banheiro.getDesignacao().getDesignacao() + 
						   " está disponivel agora!");
	}

}
