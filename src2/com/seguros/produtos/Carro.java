package com.seguros.produtos;

import com.seguros.Seguravel;

public class Carro implements Seguravel {

	private String modelo;
	private double valorMercado;
	private int anoFabricacao;
	
	
	
	public Carro(String modelo, double valorMercado, int anoFabricacao) {
		this.modelo = modelo;
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}
	
	@Override
	public double calcularValorApolice() {
		// cálculos fictícios do valor de uma apólice de um carro
		double valorApolice = this.valorMercado * 0.04;
			if (anoFabricacao < 2000) {
				valorApolice = valorApolice * 0.90;
			}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro " + this.modelo +  " ano " + this.anoFabricacao + " com valor de mercado " 
				+ this.valorMercado;
	}
	
	public double getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
