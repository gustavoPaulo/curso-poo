package com.poo.tj;


public class Masculino extends Banheiro{

	@Override
	public void exibirDetalhes() {

		System.out.println("________________________________");
		System.out.println("       Banheiro Masculino       ");
		System.out.println("________________________________");
		System.out.println("Descrição: " + getSexo());
	}
	
	Masculino(String sexo) {	
		super.setSexo(sexo);
	}

}
