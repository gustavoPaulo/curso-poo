package com.poo.joptionalpane;

import javax.swing.JOptionPane;

public class InputuJOP {

	public static void main(String[] args) {

		Object[] posibilidades = {"Masculino", "Feminino", "Outros"};
		
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "Cadastro pessoa", 
				JOptionPane.PLAIN_MESSAGE, null, posibilidades, posibilidades[0]);
		
		System.out.println("Você escolheu: " + sexo);
	}

}
