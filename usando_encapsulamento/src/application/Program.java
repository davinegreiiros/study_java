package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(nome, preco); 
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com numero de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualização do Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com numero de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do Produto: " + produto);
		
		
		
		
		sc.close();
	}

}
