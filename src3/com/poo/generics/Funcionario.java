package com.poo.generics;

public class Funcionario {

	private String nome;
	private Long idade;
	
	
	public Funcionario(String nome, Long idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void descricao() {
		System.out.println("Funcionário: " + this.nome + " com " + this.idade + " anos.");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	
	
}
