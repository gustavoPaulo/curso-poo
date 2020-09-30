package com.poo.tj;


public class Principal {

	public static void main(String[] args) {

		Masculino m1 = new Masculino("Masculino");
		Masculino m2 = new Masculino("Masculino");
		Masculino m3 = new Masculino("Masculino");
		
		Feminino f1 = new Feminino("Feminino");
		Feminino f2 = new Feminino("Feminino");
		
		
		RelatorioBanheiro relatorio = new RelatorioBanheiro();
		Banheiro[] banheiros = new Banheiro[]{m1, m2, m3, f1, f2};
		
		relatorio.exibirUsoBanheiro(banheiros);
		
		
	}

}
