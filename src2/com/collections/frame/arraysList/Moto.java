package com.collections.frame.arraysList;

public class Moto {

	private String modelo;
	

	public Moto(String modelo) {
		this.modelo = modelo;
	}
	
	public void getDescricao() {

		System.out.println("Modelo " + this.modelo + ".");
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
