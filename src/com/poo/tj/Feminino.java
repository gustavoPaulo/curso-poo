package com.poo.tj;

public class Feminino extends Banheiro{

	@Override
	public void exibirDetalhes() {

		System.out.println("________________________________");
		System.out.println("       Banheiro Feminino        ");
		System.out.println("________________________________");
		System.out.println("Descrição: " + getSexo());
	}
	
	Feminino(String sexo) {	
		super.setSexo(sexo);
	}

}
