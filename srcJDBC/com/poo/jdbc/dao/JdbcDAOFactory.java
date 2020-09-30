package com.poo.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.poo.jdbc.repository.ClienteDAO;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente?useTimezone=true&serverTimezone=UTC", "root", "admin");
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao recuperar a conexão com o banco: ", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {

		return new JdbcClienteDAO(connection);
	}
}
