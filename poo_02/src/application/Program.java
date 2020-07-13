package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func  = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.println();
		System.out.print("Empregado: "+ func);
		System.out.println();
		
		System.out.print("Qual o porcentagem que deseja aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		func.salarioPorcentagem(porcentagem);
		
		System.out.println();
		System.out.println("Salario atualizado: "+ func);
		sc.close();
		
	}

}
