package com.poo.curso.aluguel.carro;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.poo.curso.aluguel.carro.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Gustavo Silva", LocalDate.of(2002, Month.NOVEMBER, 15));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.println("Ok, pode ser cadastrado. Sua idade é: " + idade);
		} else {
			System.err.println("Sua idade é: " + idade + ". Então não pode ter cadastro no sistema.");
		}
	}

}
