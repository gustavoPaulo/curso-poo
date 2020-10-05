package com.poo.curso.stream.dao;

import java.util.ArrayList;
import java.util.List;

import com.poo.curso.stream.modelo.Fatura;

public class FaturaDao {

	public List<Fatura> buscarTodasFaturas(){
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("gustavo-tj@hotmail.com", 1250.0));
		faturas.add(new Fatura("chatboot@hotmail.com", 50.0));
		faturas.add(new Fatura("gdslems@gmail.com", 114.8));
		faturas.add(new Fatura("chucris@gmail.com", 400.0));
		
		return faturas;
	}	
	
}
