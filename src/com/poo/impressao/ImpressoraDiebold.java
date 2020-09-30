package com.poo.impressao;

public class ImpressoraDiebold implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {

		System.out.println("*********************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("*********************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("---------------------");
		System.out.println("=      DIEBOLD      =");
		System.out.println("---------------------");
	}

}
