package com.poo.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Av. Capitão Antão de Moura, 645 - Casa 10", "São Vicente", "SP");
		
		Telefone telefone1 = new Telefone("Celulcar", "(13) 98228-8624");
		Telefone telefone2 = new Telefone("Comecrial", "(11) 97425-8525");
		Telefone telefone3 = new Telefone("Recado", "(13) 98101-4070");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(telefone1);
		telefones.add(telefone2);
		telefones.add(telefone3);
		
		
		Cliente cliente = new Cliente("Gustavo Silva", 23L, endereco, telefones);
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		Cliente c2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(c2.getNome());
		System.out.println(c2.getEndereco().getLogradouro());
		
		for (Telefone telefone : telefones) {
			
			System.out.println(telefone.getTipo());
			System.out.println(telefone.getNumero());
		}
	}

}
