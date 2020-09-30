package com.poo.jdbc;

import com.poo.jdbc.dao.DAOFactory;
import com.poo.jdbc.model.Cliente;
import com.poo.jdbc.repository.ClienteDAO;

public class BuscarPeloCodigo {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		Cliente cliente = clienteDAO.buscarPeloCodigo(3L);
		
		if(cliente != null) {
			System.out.println("#  Cliente encontrado  #");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.printf("Idade: %d\n", cliente.getIdade());
			System.out.println();
		}else {
			System.out.println("Nenhum cliente encontrado.");
		}
	}
	
}
