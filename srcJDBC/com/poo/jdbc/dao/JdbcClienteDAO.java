package com.poo.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.model.Cliente;
import com.poo.jdbc.repository.ClienteDAO;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;
	
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	
	@Override
	public void salvar(Cliente cliente) {
		try {
		
			String sql = String.format("insert into cliente(nome, idade) values('%s', '%s')", cliente.getNome(), cliente.getIdade());
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) { }
		}
			
	}


	@Override
	public Cliente buscarPeloCodigo(long codigo) {

		Cliente cliente = null;
		
		try {
			
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setIdade(rs.getLong("idade"));
			}
			
		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) { }
		}
		
		return cliente;
	}


	@Override
	public List<Cliente> buscarTodos() {

		List<Cliente> clientes = new ArrayList<>();
		
		try {
			
			String sql = String.format("select * from cliente");
			
			PreparedStatement ps = this.connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				cliente.setIdade(rs.getLong("idade"));
				
				clientes.add(cliente);
			}
			
		} catch (SQLException e) {
			throw new DAOException("Erro buscando clientes: ", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) { }
		}
		
		return clientes;
	}

}
