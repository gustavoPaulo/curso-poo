package com.trabalhando.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendario {

	public static void main(String[] args) {

		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 1996);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(c.getTime()));
	}

}
