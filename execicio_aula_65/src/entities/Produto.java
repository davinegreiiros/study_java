package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome 
				+ ", R$ " 
				+ String.format("%.2f", preco)
				+ ", " 
				+ quantidade 
				+ " quantidade, Total: R$" 
				+ String.format("%.2f", totalValorEstoque());
				
	}
	
}
