package com.poo.curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner entrada = new Scanner(System.in)){
			System.out.print("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("\nObrigado, " + usuario.getNome() + " por se cadastrar.");
		}
	}

}
