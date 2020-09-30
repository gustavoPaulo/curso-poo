package com.poo.curso.serializando;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.poo.curso.serializando.model.Pessoa;

public class SerializandoObjeto {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rodosvaldo");
		pessoa.setIdade(31);
		pessoa.setProfissao("Motorista");
		
		try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("arquivosSerializando/pessoa.txt"))) {
			
			out.writeObject(pessoa);
			System.out.println("Pessoa salva com sucesso.");
			
		} catch (IOException e) {
			System.err.println("Não foi possível salvar a pessoa.\nErro: " + e);
		}
	}

}
