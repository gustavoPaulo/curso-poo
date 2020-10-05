package com.poo.curso.lambida.exemplo;

import java.util.List;

import com.poo.curso.lambda.dao.FaturaDAO;
import com.poo.curso.lambda.modelo.Fatura;

public class ExemploReferenciaAMetodos {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
	}
}
