package com.poo.arquivo.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("config/config.properties"));

		// Conectar no banco de dados
		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.println("Url banco: " + url);
		System.out.println("Usuário: " + usuario);
		System.out.println("Senha: " + senha);
	}
}
