package com.poo.curso.serializando;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.poo.curso.serializando.model.Pessoa;

public class DeserializandoObjeto {

	public static void main(String[] args) {

		try(ObjectInput in = new ObjectInputStream(new FileInputStream("arquivosSerializando/pessoa.txt"))) {
			
			Pessoa pessoa = (Pessoa) in.readObject();

			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Profissão: " + pessoa.getProfissao());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Falha ao converter para classe Pessoa.\nErro: " + e);
		}
	}

}
