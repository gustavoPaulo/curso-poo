package com.collections.frame.arraysList;

public class Carro {

	private String marca;
	private String modelo;
	

	public Carro(String marca, String modelo) {
		this.modelo = modelo;
	}
	
	public void getDescricao() {

		System.out.println("Modelo " + this.modelo + " da marca " + this.marca + ".");
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
