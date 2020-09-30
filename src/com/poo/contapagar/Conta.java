package com.poo.contapagar;

@SuppressWarnings("static-access")
public abstract class Conta {

	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	private Cliente cliente;

	
	public abstract void exibirDetalhes();
	
	Conta(){
		
	}
	
	Conta(Cliente cliente, String descricao, double valor, String dataVencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.cliente = cliente;
	}
	
	Conta(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}
	
	public void pagar() {
		
		System.out.println("\nConta paga com sucesso!");
		System.out.println("-----------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Vencimento: " + dataVencimento);
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Status: " + situacaoConta.PAGA);
	}
	
	public void cancelarFornecedor() {
		
		System.out.println("\nConta cancelada!");
		System.out.println("-----------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Fornecedor: " + fornecedor.getNome());
		System.out.println("Status: " + situacaoConta.CANCELADA);
	}
	
	public void cancelarCliente() {
		
		System.out.println("\nConta cancelada!");
		System.out.println("-----------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Status: " + situacaoConta.CANCELADA);
	}
	
	public void receber() {
		
		System.out.println("\nPagamento recebido!");
		System.out.println("-----------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Vencimento: " + dataVencimento);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Status: " + situacaoConta.PENDENTE);
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
