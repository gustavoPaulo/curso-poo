package com.poo.varargs;

public class CorreioEletronico {

	public static void enviarEmails(String... emails) {

		for(String email : emails) {
			
			System.out.println("E-mail enviado para: " + email);
		}
	}

}
