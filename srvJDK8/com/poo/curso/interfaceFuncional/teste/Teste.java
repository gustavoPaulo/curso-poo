package com.poo.curso.interfaceFuncional.teste;

import com.poo.curso.interfaceFuncional.impressao.Impressora;

public class Teste {

	public static void main(String[] args) {

		// Antes
		//Impressora i = new ImpressoraDiebold();
		
		
		// Os () indicam o método que não recebe nada e então eu posso passar outra ação a ele.
		// Ou um atributo que o metodo receba mas só indigo um nome para ele. Exemplo: Produto p
		Impressora i = () -> {
			System.out.println("Simulando a impressão.");
		};
		
		i.imprimir();
	}

}
