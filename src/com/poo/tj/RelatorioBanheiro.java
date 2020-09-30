package com.poo.tj;

public class RelatorioBanheiro {

	public void exibirUsoBanheiro(Banheiro[] banheiros) {
		
		System.out.println("=============================================");
		System.out.println("             RELATÓRIO DO BANHEIRO           ");
		System.out.println("=============================================");
		
		for (int i = 0; i < banheiros.length; i++) {
		
			banheiros[i].exibirDetalhes();
		}
	}
}
