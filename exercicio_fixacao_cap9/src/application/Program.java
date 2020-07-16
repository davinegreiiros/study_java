package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;

		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial (S/N)? ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.print("Valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numConta, nome, depositoInicial);
		} 
		else {
			banco = new Banco(numConta, nome);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(banco);

		System.out.println();
		System.out.print("Entre com valor para SAQUE: ");
		double depositarValor = sc.nextDouble();
		banco.deposito(depositarValor);
		System.out.println("Valor da conta atualizado pos DEPOSITO: ");
		System.out.println(banco);

		System.out.println();
		System.out.print("Entre com valor para SAQUE: ");
		double sacarValor = sc.nextDouble();
		banco.saque(sacarValor);
		System.out.println("Valor da conta atualizado pos SAQUE: ");
		System.out.println(banco);

		sc.close();
	}

}
