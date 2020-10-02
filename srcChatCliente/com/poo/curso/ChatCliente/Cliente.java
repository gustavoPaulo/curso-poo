package com.poo.curso.ChatCliente;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.poo.curso.ChatCliente.gui.JanelaGui;
import com.poo.curso.ChatCliente.thread.RecebeMensagemServidor;

public class Cliente extends JanelaGui{

	private Socket socket;
	
	public static void main(String[] args) {
		new Cliente();
	}
	
	
	@Override
	protected boolean conectar() {
		System.out.println("Conectando no servidor...");
		try {
			this.socket = new Socket("192.168.0.8", 3333);
			RecebeMensagemServidor recebeMensagemServidor = new RecebeMensagemServidor(this.socket, this);
			new Thread(recebeMensagemServidor).start();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}

	@Override
	protected void sendMessage(String mensagem) {
		System.out.println("De - " + mensagem);
		
		try {
			OutputStream os = this.socket.getOutputStream();
			DataOutput dos = new DataOutputStream(os);
			dos.writeUTF(mensagem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
