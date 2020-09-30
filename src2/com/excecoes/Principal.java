package com.excecoes;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente minhaConta = new ContaCorrente(77.50);
		
		try {

			minhaConta.saldoAtual();
			minhaConta.sacar(70);
			minhaConta.sacar(7);
			minhaConta.sacar(0.5);
			minhaConta.sacar(0.0);
			
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}
		
	}

}
