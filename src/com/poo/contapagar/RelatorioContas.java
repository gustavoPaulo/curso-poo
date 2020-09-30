package com.poo.contapagar;

public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {

		System.out.println("=============================================");
		System.out.println("             RELATÓRIO DE CONTAS             ");
		System.out.println("=============================================");
		
		for (int i = 0; i < contas.length; i++) {
		
			contas[i].exibirDetalhes();
		}
	}
}
