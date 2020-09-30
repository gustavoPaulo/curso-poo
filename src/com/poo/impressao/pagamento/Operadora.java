package com.poo.impressao.pagamento;

public interface Operadora {

	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
