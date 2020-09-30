package com.poo.impressao.pagamento;

public class Master implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		return cartao.getNumeroCartao().startsWith("550")
				&& autorizavel.getValorTotal() < 100;
	}

}
