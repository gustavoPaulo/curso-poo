package com.poo.joptionalpane;

import javax.swing.JOptionPane;

public class OptionalComplexo {

	public static void main(String[] args) {

		Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
		
		
		JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?", 
				"Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, opcoes, opcoes[2]);
		
		
	}

}
