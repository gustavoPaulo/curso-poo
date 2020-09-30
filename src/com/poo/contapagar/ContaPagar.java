package com.poo.contapagar;

public class ContaPagar extends Conta{
	
	public void exibirDetalhes() {
		
		System.out.println("_______________________________________________");
		System.out.println("       Detalhamento das Contas a Receber       ");
		System.out.println("_______________________________________________");
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		System.out.println("Valor: " + getValor());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Situação: PAGO");
	}
	
	ContaPagar() {
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		super.setFornecedor(fornecedor);
		super.setDescricao(descricao);
		super.setValor(valor);
		super.setDataVencimento(dataVencimento);
	}

	public void pagar() {
		
		super.pagar();
	}
	
	public void cancelar() {
		
		super.cancelarFornecedor();
	}
}
