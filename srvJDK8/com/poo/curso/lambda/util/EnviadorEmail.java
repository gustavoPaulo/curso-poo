package com.poo.curso.lambda.util;

public class EnviadorEmail {

	public void enviar(String email, String texto) {
		System.out.println("Enviando e-mail para: " + email);
		System.out.println(texto);
	}
}
