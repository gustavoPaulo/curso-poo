package com.poo.curso.chatServidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.poo.curso.chatServidor.thread.RecebeMensagemCliente;

public class Servidor {

	private List<RecebeMensagemCliente> clientes = new ArrayList<>();

	
	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		servidor.aguardaConexoes();
	}

	public void aguardaConexoes() {
		
		try(ServerSocket server = new ServerSocket(3333)) {

			while(true) {
				System.out.println("Aguardando conexões...");
				Socket socket = server.accept();
				
				RecebeMensagemCliente recebeMensagemCliente = new RecebeMensagemCliente(socket, this);
				new Thread().start();
				
				this.clientes.add(recebeMensagemCliente);
				System.out.println("Novo cliente conectado.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarMensagensClientes(String mensagem) {
		for (RecebeMensagemCliente clientes : this.clientes) {
			clientes.enviarMensagem(mensagem);
		}
	}
	
	
}
