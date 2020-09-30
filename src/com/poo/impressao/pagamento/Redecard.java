package com.poo.impressao.pagamento;

public class Redecard implements Operadora{

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		return cartao.getNumeroCartao().startsWith("456")
				&& autorizavel.getValorTotal() < 200;
	}
}
