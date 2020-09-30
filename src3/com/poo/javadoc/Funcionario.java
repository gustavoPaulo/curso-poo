package com.poo.javadoc;

/**
 * Representa um funcionario da empresa.
 * 
 * @author Gustavo Silva
 *
 */
public class Funcionario {

	private String nome;
	private double salario;
	

	/**
	 * Nao utilize pois o salario e necessario para os metodos seguintes.
	 * 
	 * @deprecated
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/**
	 * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
	 * 
	 * <p>O valor da diaria e calculado dividindo-se o <b>salario bruto por 30 (dias do mes).</b></p> 
	 *  
	 * Caso o destino for uma capital, e adicionado 20% no valor do adiantamento. 
	 * <br>
	 *  
	 * @param	dias
	 * 			Quantidade de dias da viagem.
	 * 
	 * @param 	capital
	 * 			Indica se e ou nao uma capital brasileira.
	 * 
	 * @return	O valor em reais do adiantamento.
	 * 
	 * @since	1.1.24
	 * 
	 * @throws	IllegalArgumentException
	 * 			Caso {@code dias} for menor ou igual a zero.
	 * 
	 * @see		Viagem
	 */
	public double adiantamentoViagem(int dias, boolean capital) {
		if(dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero");
		}
		
		double valorDiaria = salario / 30;
		double valorAdiantamento = valorDiaria * dias;
		
		if(capital) {
			valorAdiantamento *= 1.20;
		}
		
		return valorAdiantamento;
	}
	
}
