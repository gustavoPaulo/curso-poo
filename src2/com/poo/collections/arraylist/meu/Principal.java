package com.poo.collections.arraylist.meu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Gustavo", 23), 
											 new Pessoa("Gabriela", 21),
											 new Pessoa("Rodrigo", 50),
											 new Pessoa("Albertina", 85));
		
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			pessoa.imprimeDetalhes();
		}
	}

}
