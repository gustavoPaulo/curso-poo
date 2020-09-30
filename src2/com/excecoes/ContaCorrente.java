package com.excecoes;

public class ContaCorrente {

	private double saldo;
	
	
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	private void imprimeCabecalhoExtrato() {
		System.out.println("-------------------------");
		System.out.println("    BEM VINDO AO ITAU    ");
		System.out.println("-------------------------");
		
		System.out.println("\nTipo: Conta Corrente");
		System.out.println("Titular: GUSTAVO S PAULO");
	}
	
	public void saldoAtual() {
		imprimeCabecalhoExtrato();
		System.out.println("\nSaldo: R$" + this.saldo);
	}

	
	public void depositar(double deposito) {
		
		if(deposito <= 1) {
			throw new IllegalArgumentException("\nO valor para depósito deve ser maior que R$1,00.");
		}
		
		this.saldo += deposito;
		System.out.println("\nDesposito efetuado: R$" + deposito);
		System.out.println("Saldo atual: R$" + this.saldo);
	}
	
	public void sacar(double quantidade) {
		
		if(quantidade > this.saldo || quantidade == 0) {
			throw new IllegalArgumentException("\nSaldo indiponível!"
			 + "\nSeu saldo é menor que R$" + quantidade);
		}else {
		
			this.saldo -= quantidade;
			System.out.println("\nSaque efetuado: R$" + quantidade);
			System.out.println("Saldo atual: R$" + this.saldo);
		}
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
}
