package com.poo.curso.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmails {

	public static void main(String[] args) {
		
		String[] emails = {"joao@joao.com", "maria@maria.com", "ricardo@ricardo.com", "gustavo-tj@hotmail.com"};
		
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("arquivosIO/emails.txt"))) {
			
			for(String email : emails) {
				writer.write(email);
				writer.newLine();
			}
			
			System.out.println("Arquivo criado com sucesso.");
			
		} catch(IOException e) {
			System.err.println("Não foi possível gravar o arquivo.\nErro: " + e);
		}
	}
	
}
