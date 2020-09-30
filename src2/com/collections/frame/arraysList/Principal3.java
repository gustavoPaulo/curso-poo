package com.collections.frame.arraysList;

import java.util.HashMap;
import java.util.Map;

public class Principal3 {

	public static void main(String[] args) {

		// Map Hash Map 
		Moto m1 = new Moto("Mob");
		Moto m2 = new Moto("Onix");
		Moto m3 = new Moto("Fiesta");
		Moto m4 = new Moto("Viper");
		
		Map<String, Moto> motos = new HashMap<String, Moto>();
		
		     // Chave  Valor
		motos.put("1", m1);
		motos.put("2", m2);
		motos.put("3", m3);
		motos.put("4", m4);

		imprimirMotos(motos);
	}
	
	private static void imprimirMotos(Map<String, Moto> motos) {

		for (Moto m : motos.values()) {
			m.getDescricao();
		}
	}

}
