package com.poo.curso.lambida.exemplo;

import java.util.List;

import com.poo.curso.lambda.dao.FaturaDAO;
import com.poo.curso.lambda.modelo.Fatura;
import com.poo.curso.lambda.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail enviarEmail = new EnviadorEmail();
		
		/* Sem lambda, jeito comum
		for (Fatura fatura : faturasVencidas) {
			enviarEmail.enviar(fatura.getEmailDevedor(), fatura.resumo());
		}*/
		
		// Com...
		faturasVencidas.forEach(f -> {
			enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
		
		// Ou...Porém com uma tarefa só
		faturasVencidas.forEach(f -> enviarEmail.enviar(f.getEmailDevedor(), f.resumo()));
	}
	
}
