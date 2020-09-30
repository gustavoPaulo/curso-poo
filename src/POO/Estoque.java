package POO;

public class Estoque {

	Produto[] produtos;
	int quantidadeProdutos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");
				
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
			
			quantidadeProdutos += produtos[i].quantidade;
		}

		System.out.println("\nTotal em estoque: " + quantidadeProdutos);
	}
	
}