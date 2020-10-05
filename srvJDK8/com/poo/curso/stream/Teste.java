package com.poo.curso.stream;

import java.util.List;

import com.poo.curso.stream.dao.FaturaDao;
import com.poo.curso.stream.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {

		List<Fatura> faturas = new FaturaDao().buscarTodasFaturas();
		
		/* Jeito comum
		for (Fatura fatura : faturas) {
			if(fatura.getValor() > 250.0) {
				System.out.println("Atenção: Fatura de risco maior que R$250.0. Por gentileza efetue o pagemnto no valor de R$" + fatura.getValor());
			}
		}*/
		
		
		// Com Stream
		faturas.stream()
			   	.filter(Fatura::estaEmRisco)
			   	.forEach(f -> f.imprimir());
	}

}
