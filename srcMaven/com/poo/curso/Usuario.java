package com.poo.curso;

import org.apache.commons.lang3.StringUtils;

public class Usuario {

	private String nome;
	private int idade;
	
	
	public Usuario(String nome, int idade) {
		
		if(StringUtils.isBlank(nome)) {
			throw new IllegalArgumentException("Nome deve ser informado");
		}
		
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
