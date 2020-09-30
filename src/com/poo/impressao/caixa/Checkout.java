package com.poo.impressao.caixa;

import com.poo.impressao.Impressora;
import com.poo.impressao.pagamento.Cartao;
import com.poo.impressao.pagamento.Operadora;

public class Checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			this.impressora.imprimir(compra);
		}else {
			System.out.println("Pagamento não autorizado!");
		}
	}
	
}
