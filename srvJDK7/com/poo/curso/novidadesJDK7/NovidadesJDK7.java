package com.poo.curso.novidadesJDK7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NovidadesJDK7 {

	public static void main(String[] args) {

		NovidadesJDK7 exemplo = new NovidadesJDK7();
		
		System.out.println("#  Exemplo 1  #\n");
		exemplo.exemploSeparadorDigitosLiterais();
		
		System.out.println("\n#  Exemplo 2  #\n");
		exemplo.switchCaseComString("Hondad");
		
		System.out.println("\n#  Exemplo 3  #\n");
		exemplo.diamond();
		
		System.out.println("\n#  Exemplo 4  #\n");
		exemplo.tryEMultiCast();
	}

	
	public void exemploSeparadorDigitosLiterais() {
		long populacaoSaoPaulo = 11_000_000L;
		long populacaoDaGrandeSaoPaulo = 11_000_000 + 9_523_451;
		
		System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("População da Grande São Paulo: %d\n", populacaoDaGrandeSaoPaulo);
		
		double precoVeiculo = 200_000.99_1d;
		System.out.printf("Preço veículo: %.2f\n", precoVeiculo);
	}
	
	public void switchCaseComString(String carro) {
		
		switch (carro) {
		case "Audi":
			System.out.println("Alemão");
			break;
		case "Ferrari":
			System.out.println("Italiano");
			break;
		case "Honda":
			System.out.println("Japonês");
			break;
		default:
			System.out.println("Não informou nenhum carro.");
		}
	}
	
	public void diamond() {
		
		// Sem o Diamond -> new ArrayList<String>();
		List<String> clientes = new ArrayList<>();
		
		clientes.add("EFL Estacionamentos");
		clientes.add("JR Caraveli");
		clientes.add("DB Schenker do Brasil");
		clientes.add("Kuehne Nagel");
		
		Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
		
		carrosPorMontadora.put("Chevrolet", new HashSet<String>());
		carrosPorMontadora.get("Chevrolet").add("Cruze");
	}
	
	public void tryEMultiCast() {
		try(Scanner entrada = new Scanner(System.in)){

			String nome = entrada.nextLine();
			System.out.println(nome);
			
		// Como poderia ser catch(Exception | NullPointerException e){}	
		} catch	(Exception e) {
			
		}
	}
	
	
}
