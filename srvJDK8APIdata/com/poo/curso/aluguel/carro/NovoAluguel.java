package com.poo.curso.aluguel.carro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.poo.curso.aluguel.carro.model.Aluguel;
import com.poo.curso.aluguel.carro.model.Carro;
import com.poo.curso.aluguel.carro.model.Cliente;
import com.poo.curso.aluguel.carro.util.Recibo;

public class NovoAluguel {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Gustavo Silva", LocalDate.of(2002, Month.NOVEMBER, 15));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		Recibo recibo = new Recibo();
		recibo.imprimirRecibo(aluguel);
	}

}
