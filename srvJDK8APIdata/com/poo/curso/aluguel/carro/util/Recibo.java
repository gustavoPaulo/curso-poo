package com.poo.curso.aluguel.carro.util;

import java.time.format.DateTimeFormatter;

import com.poo.curso.aluguel.carro.model.Aluguel;

public class Recibo {

	public void imprimirRecibo(Aluguel aluguel) {
		
		System.out.println(">>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("Retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Previsão de devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}
}
