package com.collections.frame.arraysList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// List ArrayList  Obs: Imprime na ordem que você coloca
		Carro c1 = new Carro("Fiat","Mob");
		Carro c2 = new Carro("Chvrolet","Onix");
		Carro c3 = new Carro("Ford","Fiesta");
		Carro c4 = new Carro("Dogde","Viper");
		
		List<Carro> carros = new ArrayList<Carro>();
		
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		carros.add(c4);
		
		for (Carro carro : carros) {

			carro.getDescricao();
		}
		
	}

}
