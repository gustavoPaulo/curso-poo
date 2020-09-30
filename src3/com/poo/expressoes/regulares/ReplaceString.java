package com.poo.expressoes.regulares;

public class ReplaceString{

	public static void main(String[] args) {

		String texto = "O valor do produto é R$ @bb@";
		
		String novoTexto = texto.replaceAll("@b+@", "6,90");
		
		System.out.println(novoTexto);
	}

}
