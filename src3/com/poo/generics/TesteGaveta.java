package com.poo.generics;

public class TesteGaveta {

	public static void main(String[] args) {
		
		Gaveta<String> gaveta = new Gaveta<>();
		
		gaveta.colocar("Mesa para escritorio");
		gaveta.colocar("Controle de Video Game");
		
		gaveta.toString();
	}
}
