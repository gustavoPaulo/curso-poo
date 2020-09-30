package com.poo.tj;

public abstract class Banheiro {

	private String sexo;
	
	
	public abstract void exibirDetalhes();
	
	
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
}
