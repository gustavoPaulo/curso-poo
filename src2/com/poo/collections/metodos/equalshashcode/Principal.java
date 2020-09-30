package com.poo.collections.metodos.equalshashcode;

import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		// O Set HashSet pega os dados de forma aleatorio, trazendo um aluno para n�s.
		Aluno alunoSorteado = new Aluno("Maria");
		
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parab�ns " + alunoSorteado.getNome() + "! Voc� ganhou!");
		}else {
			System.out.println("Aluno n�o cadastro no banco de dados.");
		}
	}

}
