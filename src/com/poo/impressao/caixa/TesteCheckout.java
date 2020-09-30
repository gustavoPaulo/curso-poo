package com.poo.impressao.caixa;

import com.poo.impressao.Impressora;
import com.poo.impressao.ImpressoraHP;
import com.poo.impressao.pagamento.Cartao;
import com.poo.impressao.pagamento.Master;
import com.poo.impressao.pagamento.Operadora;

public class TesteCheckout {

	public static void main(String[] args) {

		Operadora operadora = new Master();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("GUSTAVO DA SILVA");
		cartao.setNumeroCartao("5502093222780543");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Claudio");
		compra.setProduto("Sabonete Palmolive - Neutro");
		compra.setValorTotal(99);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
	}
}
