package com.poo.log4j;

import org.apache.log4j.Logger;

public class ClienteDAO {

	private static Logger logger = Logger.getLogger(ClienteDAO.class);
	
	public void salvar(Cliente cliente) {
		logger.debug("Salvando o cliente: " + cliente.getNome());
		logger.debug("Cliente salvo com sucesso.");
	}
}
