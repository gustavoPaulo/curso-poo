package com.poo.jdbc.dao;

import com.poo.jdbc.repository.ClienteDAO;

public abstract class DAOFactory {

	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
}
