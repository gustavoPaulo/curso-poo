package com.poo.joptionalpane;

import javax.swing.JOptionPane;

public class OptionalComplexo {

	public static void main(String[] args) {

		Object[] opcoes = {"Sim", "N�o", "Sim, com e-mail"};
		
		
		JOptionPane.showOptionDialog(null, "Voc� gostaria de finalizar o cadastro?", 
				"Confirma��o", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, opcoes, opcoes[2]);
		
		
	}

}
