package com.poo.enums;

public enum Designacao {

	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	BISEXUAL("Bi"),
	TRANSEXUAL("Trans");
	
	
	private String designacao;
	
	Designacao(String designacao){
		this.designacao = designacao;
	}
	
	public String getDesignacao() {
		return designacao;
	}
	
}
