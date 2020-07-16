package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for(int i = 0; i<vect.length ; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		
		for (int i = 0 ;i<vect.length ;i++) {
			soma += vect[i].getPreco();	
		}
		double avg = soma / vect.length;
		
		System.out.printf("A media dos preços =  %.2f%n", avg);
	
		
	
	sc.close();
	}

}
