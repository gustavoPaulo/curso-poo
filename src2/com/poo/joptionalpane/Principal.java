package com.poo.joptionalpane;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Novo cadastro", JOptionPane.DEFAULT_OPTION);
		String email = JOptionPane.showInputDialog(null, "Digite seu e-mail", "Novo cadastro", JOptionPane.DEFAULT_OPTION);
		
		if(nome.isEmpty() || email.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Por favor, Nome e E-mail devem ser preenchidos.", "Informações faltantes", JOptionPane.WARNING_MESSAGE);
			
		}else {
	
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cadastrar esse usuário?");
		
			if(resposta == 0) {
				String textoSim = "Nome: " + nome + "\n" + "E-mail: " + email;
				JOptionPane.showMessageDialog(null, textoSim, "Cadastro efetuado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
			}
			if(resposta == 1) {
				String textoNao = "Ok, até mais.";
				JOptionPane.showMessageDialog(null, textoNao, "Cadastro cancelado", JOptionPane.YES_OPTION);
			}
		}
	}

}
