package entities;

public class Banco {
	private int numConta;
	private String nome;
	private double saldo;

	
	//CONSTRUTORES
	public Banco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public Banco(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	//ENCAPSULAMENTO
	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	//FUNÇÕES 
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0; 
	}
	
	public String toString() {
		return "Conta "
				+ numConta
				+ ", Titular: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);
	}

}
