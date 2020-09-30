package com.poo.contapagar;

public class ContaReceber extends Conta{

	public void exibirDetalhes() {
		
		System.out.println("_______________________________________________");
		System.out.println("       Detalhamento das Contas a Pagar         ");
		System.out.println("_______________________________________________");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situação: PENDENTE");
	}
	
	ContaReceber() {
		
	}
	
	ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {	
		super.setCliente(cliente);
		super.setDescricao(descricao);
		super.setValor(valor);
		super.setDataVencimento(dataVencimento);
	}
	
	public void cancelar() {
		
		super.cancelarCliente();
	}
	
	public void receber() {
		
		super.receber();
	}

}
