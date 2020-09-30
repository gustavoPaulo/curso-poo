package com.poo.jdbc;

import javax.swing.JOptionPane;

import com.poo.jdbc.dao.DAOFactory;
import com.poo.jdbc.model.Cliente;
import com.poo.jdbc.repository.ClienteDAO;

public class SalvarCliente {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Nome do cliente", "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);
		String idade = JOptionPane.showInputDialog(null, "Idade do cliente", "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);
		
		Cliente cliente = new Cliente();
		
		if(!nome.isEmpty() && !idade.isEmpty()) {
		
			cliente.setNome(nome);
			cliente.setIdade((long) Integer.parseInt(idade));
		
			ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
			clienteDAO.salvar(cliente);
		
			System.out.println("Cliente salvo com sucesso.");
		}
	}

}
