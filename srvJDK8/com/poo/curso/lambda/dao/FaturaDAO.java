package com.poo.curso.lambda.dao;

import java.util.ArrayList;
import java.util.List;

import com.poo.curso.lambda.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas(){
		
		// Buscaria esses dados do banco
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@gmail.com", 42.9));
		faturas.add(new Fatura("gustavo1@gmail.com", 350.0));
		faturas.add(new Fatura("rodrigo2@gmail.com", 1350.0));
		faturas.add(new Fatura("marilia4@gmail.com", 685.0));
		
		return faturas;
	}
}
