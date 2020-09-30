package com.poo.json;

import java.util.List;

public class Cliente {

	private String nome;
	private Long idade;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Long idade, Endereco endereco, List<Telefone> telefones) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefones = telefones;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}
