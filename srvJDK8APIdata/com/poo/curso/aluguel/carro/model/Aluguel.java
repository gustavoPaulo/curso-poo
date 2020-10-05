package com.poo.curso.aluguel.carro.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	
	private LocalDateTime dataEHoraDaRetirada;
	private LocalDateTime dataEHoraPrevistaParaDevolucao;
	private LocalDateTime dataEHoraRealDaDevolucao;
	
	
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada,
			LocalDateTime dataEHoraPrevistaParaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
		this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
	}
	
	public void imprimeFatura() {
		Duration duration = Duration.between(dataEHoraPrevistaParaDevolucao, dataEHoraRealDaDevolucao);
		
		System.out.println(">>>>>>>>>> Fatura <<<<<<<<<<");
		
		if(!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.println("Valor da multa: R$" + multa);
			System.out.println("Multa devido ao atraso de " + duration.toDays() + " dias.");
		} else {
			System.out.println("Obrigado. Você foi pontual.");
		}
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalDateTime getDataEHoraDaRetirada() {
		return dataEHoraDaRetirada;
	}
	public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
	}
	public LocalDateTime getDataEHoraPrevistaParaDevolucao() {
		return dataEHoraPrevistaParaDevolucao;
	}
	public void setDataEHoraPrevistaParaDevolucao(LocalDateTime dataEHoraPrevistaParaDevolucao) {
		this.dataEHoraPrevistaParaDevolucao = dataEHoraPrevistaParaDevolucao;
	}
	public LocalDateTime getDataEHoraRealDaDevolucao() {
		return dataEHoraRealDaDevolucao;
	}
	public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
		this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
	}
	
	
}
