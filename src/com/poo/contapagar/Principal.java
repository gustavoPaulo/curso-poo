package com.poo.contapagar;

public class Principal {

	public static void main(String[] args) {

				Fornecedor imobiliaria = new Fornecedor();
				imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
				
				Fornecedor mercado = new Fornecedor();
				mercado.setNome("Mercado do Jo�o");
				
				Cliente atacadista = new Cliente();
				atacadista.setNome("Tri�ngulo Quadrado Atacadista");
				
				Cliente telecom = new Cliente();
				telecom.setNome("FoneNet Telecomunica��es");
				
				ContaPagar contaPagar1 = new ContaPagar();
				contaPagar1.setDescricao("Aluguel da matriz");
				contaPagar1.setValor(1230d);
				contaPagar1.setDataVencimento("10/05/2012");
				contaPagar1.setFornecedor(imobiliaria);
				
				ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
				
				ContaReceber contaReceber1 = new ContaReceber();
				contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
				contaReceber1.setValor(89500d);
				contaReceber1.setDataVencimento("23/05/2012");
				contaReceber1.setCliente(atacadista);
				
				ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 
					53200d, "13/05/2012");
				
				// pagamento e cancelamento de contas a pagar
				contaPagar1.pagar();
				contaPagar2.cancelarFornecedor();

				// recebimento e cancelamento de contas a receber
				contaReceber1.receber();
				contaReceber2.cancelarCliente();
				
				System.out.println();
				System.out.println();
				
				RelatorioContas relatorio = new RelatorioContas();
				Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
				
				relatorio.exibirListagem(contas);
			}
	
}
