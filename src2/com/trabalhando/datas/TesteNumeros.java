package com.trabalhando.datas;

import java.text.DecimalFormat;

public class TesteNumeros {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("R$#,##0.00");
		double valorProduto = 1.50;
		
		System.out.println("Valor: " + formatador.format(valorProduto));
	}

}
