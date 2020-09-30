package com.collections.frame.arraysList;

import java.util.HashSet;
import java.util.Set;

public class Principal2 {

	public static void main(String[] args) {

		// Set Hash Set  Obs: Imprime em ordem aleatoria
		Carro c1 = new Carro("Fiat","Mob");
		Carro c2 = new Carro("Chvrolet","Onix");
		Carro c3 = new Carro("Ford","Fiesta");
		Carro c4 = new Carro("Dogde","Viper");
		
		Set<Carro> carros = new HashSet<Carro>();
		
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		carros.add(c4);
		
		for (Carro carro : carros) {
			carro.getDescricao();
		}
	}

}
