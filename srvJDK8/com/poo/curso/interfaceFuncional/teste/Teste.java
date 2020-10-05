package com.poo.curso.interfaceFuncional.teste;

import com.poo.curso.interfaceFuncional.impressao.Impressora;

public class Teste {

	public static void main(String[] args) {

		// Antes
		//Impressora i = new ImpressoraDiebold();
		
		
		// Os () indicam o m�todo que n�o recebe nada e ent�o eu posso passar outra a��o a ele.
		// Ou um atributo que o metodo receba mas s� indigo um nome para ele. Exemplo: Produto p
		Impressora i = () -> {
			System.out.println("Simulando a impress�o.");
		};
		
		i.imprimir();
	}

}
