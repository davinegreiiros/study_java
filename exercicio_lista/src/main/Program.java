package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios deseja cadastrar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Esse ID ja existe, tente novamente: ");
				id = sc.nextInt();
			}
	
			System.out.print("Nome: ");
			sc.hasNextLine();
			String nome = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			list.add(func);
			
		}
		
		System.out.println();
		System.out.print("Entre com ID do funcionario que deseja aumentar o salario: ");
		Integer idSalario = sc.nextInt();
		
		Funcionario func = list.stream().filter(x ->x.getId() == idSalario).findFirst().orElse(null);	
		
		//Integer pos = position(list, idSalario);
		
		if( func == null) {
			System.out.println("Id não existe");
		}
		else {
			System.out.print("Qual a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.porcentagemSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for( Funcionario f : list) {
			System.out.println(func);
		}

	sc.close();
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for(int i = 0 ; i< list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
