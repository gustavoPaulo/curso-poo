package com.poo.expressoes.regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

	public static void main(String[] args) {
		
		String[] emails = {"gustavotj@hotmail.com", "gshdgs@", "sdjfjfj@.net", "gustavojavaweb@gmail.com"};
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);

			if(matcher.matches()) {
				System.out.println(email + " é um e-mail válido.");
			}else {
				System.out.println(email + " não é válido.");
			}
		}
	}
}
