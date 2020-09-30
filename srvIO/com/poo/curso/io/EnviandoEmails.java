package com.poo.curso.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

	public static void main(String[] args) {

		try(BufferedReader reader = new BufferedReader(new FileReader("arquivosIO/emails.txt"))) {
			
			String email = null;
			
			while((email = reader.readLine()) != null) {
				System.out.println("E-mail enviado com sucesso para: " + email);
			}
			
		} catch (IOException e) {
			System.err.println("Não foi possível ler o arquivo.\nErro: " + e);
		}
	}

}
