package com.operacoes.matematicas;

public class Principal {

	public static void main(String[] args) {

		// Comprimento
		int raio = 4;
		double comprimento = 2 * raio * Math.PI;
		
		System.out.println(comprimento);
		
		// Máximo e minimo
		double[] precosProdutoA = {25.499, 25.4989};
		
		System.out.println("Maior preço: " + Math.max(precosProdutoA[0], precosProdutoA[1]));
	}

}
