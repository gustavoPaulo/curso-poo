package com.poo.jdbc;

import java.util.List;

import com.poo.jdbc.dao.DAOFactory;
import com.poo.jdbc.model.Cliente;
import com.poo.jdbc.repository.ClienteDAO;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for(Cliente cliente : clientes) {
			System.out.println("#  Cliente  #");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.printf("Idade: %d\n", cliente.getIdade());
			System.out.println();
		}
	}
	
}
