package com.poo.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Funcionario("Gustavo", 23L));
		funcionarios.add(new Funcionario("Gabriela", 21L));
		funcionarios.add(new Funcionario("Romilda", 32L));
		funcionarios.add(new Funcionario("Walesca", 18L));

		
		for (Funcionario funcionario : funcionarios) {
			funcionario.descricao();
		}
	}

}
