package com.poo.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Iniciando a aplica��o.");
		
		Cliente cliente = new Cliente("Gustavo");
		
		new ClienteDAO().salvar(cliente);
		
		logger.info("Finalizando a aplica��o.");
	}
}
