package com.seguros;

import com.seguros.produtos.Barco;
import com.seguros.produtos.Carro;
import com.seguros.produtos.Imovel;

public class Principal {

	public static void main(String[] args) {

		CorretoraSeguros corretora = new CorretoraSeguros();
		Carro meuCarro = new Carro("Onix", 55390d, 2020);
		Imovel minhaCasa = new Imovel(350000d, 320);
		Barco meuBarco = new Barco("Gabriela", 8d, 3, 50000d);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
	}

}
