package POO;

public class ContasPagar {

	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	
	ContasPagar(){
		
	}
	
	ContasPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		
		System.out.println("\nConta paga com sucesso!");
		System.out.println("-----------------------");
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$" + valor);
		System.out.println("Vencimento: " + dataVencimento);
		System.out.println("Fornecedor: " + fornecedor.getNome());
	}
	
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
