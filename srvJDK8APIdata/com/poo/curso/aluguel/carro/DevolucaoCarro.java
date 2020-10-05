package com.poo.curso.aluguel.carro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.poo.curso.aluguel.carro.model.Aluguel;
import com.poo.curso.aluguel.carro.model.Carro;
import com.poo.curso.aluguel.carro.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		// Para cada hora de atraso, o motorista paga 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.now());
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimeFatura();
	}
	
	public static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("Gustavo Silva", LocalDate.of(2002, Month.NOVEMBER, 15));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		return aluguel;
	}
	
	
}
