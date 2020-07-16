package entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto (String nome, double preco, int quantidade){  //CONSTRUTOR
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto (String nome, double preco ){  //SOBRECARGA
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getName() { // ENCAPSULAMENTO
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
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
