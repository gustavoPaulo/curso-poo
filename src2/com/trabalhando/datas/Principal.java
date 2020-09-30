package com.trabalhando.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {

		// Data padrão do Java -> Thu Sep 10 16:02:26 BRT 2020
		Date data = new Date();

		// Formatador de data que precisa de um padrão iniciado -> dd/MM/yyyy HH:mm:ss
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(data));
		
		/**********************************************************************/
		
		// Data digitada pelo usuário
		String dataAniversario = "1996-11-15";
		
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		Date aniversario = formatador2.parse(dataAniversario);
		
		System.out.println(formatador2.format(aniversario));
	}

}
