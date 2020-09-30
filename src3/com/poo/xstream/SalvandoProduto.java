package com.poo.xstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		Produto sabonete = new Produto(1L, "Escova de dentes", new BigDecimal("6.90"));
		
		String xml = xstream.toXML(sabonete);
		System.out.println(xml);
		
		OutputStream os = new FileOutputStream("arquivosXML/produto2.xml");
		xstream.toXML(sabonete, os);
		
	}
}
