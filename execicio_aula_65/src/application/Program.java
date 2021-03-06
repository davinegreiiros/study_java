package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com o produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Pre�o: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com numero de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualiza��o do Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com numero de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualiza��o do Produto: " + produto);
		
		
		
		
		sc.close();
	}

}
