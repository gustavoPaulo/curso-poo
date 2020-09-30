package POO;

public class Principal3 {

	public static void main(String[] args) {

		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		
		ContasPagar conta1 = new ContasPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/09/2020");
		conta1.setFornecedor(imobiliaria);
		
		ContasPagar conta2 = new ContasPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		ContasPagar conta3 = new ContasPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();
	}

}
