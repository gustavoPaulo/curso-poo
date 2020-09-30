package com.poo.xstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoCarrinho {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new Produto(1L, "Sabonete", new BigDecimal("2.30")));
		carrinho.add(new Produto(2L, "Shampoo", new BigDecimal("12.90")));
		carrinho.add(new Produto(3L, "Pacoca", new BigDecimal("3.50")));
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.alias("carrinho", List.class);
		
		OutputStream os = new FileOutputStream("arquivosXML/carrinho.xml");
		xstream.toXML(carrinho, os);
	}
}
