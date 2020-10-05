package com.poo.curso.interfaceFuncional.impressoras;

import com.poo.curso.interfaceFuncional.impressao.Impressora;

public class ImpressoraDiebold implements Impressora{

	@Override
	public void imprimir() {
		System.out.println("Enviando o comando para impressora Diebold.");
	}

}
