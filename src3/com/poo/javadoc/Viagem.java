package com.poo.javadoc;

import java.util.Date;

/**
 * Representa o tempo que o funcionario tera de viagem. 
 * 
 * @author Gustavo Silva
 *
 */
public class Viagem {

	private Date dataInicio;
	private Date dataFim;
	private Funcionario funcionario;
	
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
