package com.poo.stringbuilder;

public class Principal {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(); // com thread-safe
		StringBuilder sbi = new StringBuilder(); // sem thread-safe

		sb.append("Gustavo");
		sb.append(" da");
		sb.append(" Silva");
		sb.append(" Paulo");
		
		System.out.println(sb);
		
		sb.insert(6, "f");
		
		System.out.println(sb);
		
		sbi.append("BooooooM!!!");
		System.out.println(sbi);
	}

}
