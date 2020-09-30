package com.seguros.produtos;

import com.seguros.Seguravel;

public class Barco implements Seguravel{

	private double tamanho;
	private String nome;
	private int quantidadeMotores;
	private double valorMercado;
	
	

	public Barco(String nome, double tamanho, int quantidadeMotores, double valorMercado) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.quantidadeMotores = quantidadeMotores;
		this.valorMercado = valorMercado;
	}
	
	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.75;
		valorApolice = valorApolice + (tamanho * 0.8);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco \"" + this.nome + "\" de tamanho " + this.tamanho + "m com " + this.quantidadeMotores + " motores "
				+ "com valor de mercado " + this.valorMercado + ".";
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}
	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	public double getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

}
