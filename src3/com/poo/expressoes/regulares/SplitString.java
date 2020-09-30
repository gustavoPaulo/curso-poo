package com.poo.expressoes.regulares;

public class SplitString {

	public static void main(String[] args) {
		
		String texto = "(13) 98228-8624";
		
		String[] palavras = texto.split("\\d");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
