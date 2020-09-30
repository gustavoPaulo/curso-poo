package com.poo.varargs;

public class TesteCorreioEletronico {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		CorreioEletronico correio = new CorreioEletronico();
		
		// Jeito convencionou do java 7 criando uma lista e adicionando cada e-mail
		/*String[] emails = new String[2];
		emails[0] = "gustavo-tj@hotmail.com";
		emails[1] = "gustavojavaweb@gmail.com";
		
		correio.enviarEmails(emails);*/
		
		
		// Agora usando varargs. Usar os "..." ao inves de "[]" como declaração comum de array
		
		correio.enviarEmails("gustavo-tj@hotmail.com", "gustavojavaweb@gmail.com");
	}
}
