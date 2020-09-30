package com.poo.heranca;

import java.util.Random;

public class Contratacao {

	public void dataInicio() {

		System.out.println("Você inicia no clube dia " + geraDia() + ".");
	}
	
	public String geraDia() {
		
		Random gerador = new Random();
		int result = 0;
		String r = "";
		
        for (int i = 1; i < 2; i++) {
        	
            result = gerador.nextInt(31);
            
            if(result != 0) {
            	r = Integer.toString(result);
            }else {
            	System.out.println("Não temos um dia marcado ainda!");
            }
        }
        
        return r;
	}
}
