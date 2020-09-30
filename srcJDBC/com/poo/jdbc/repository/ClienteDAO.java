package com.poo.jdbc.repository;

import java.util.List;

import com.poo.jdbc.model.Cliente;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(long codigo);

	public List<Cliente> buscarTodos();
}
