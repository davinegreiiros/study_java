package principal_exercicio;

import java.util.Scanner;

import entidades_exercicio.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 Aluguel[] vect = new Aluguel[10];
		 
		 System.out.print("Quantos quartos vão ser alugados: ");
		 int n = sc.nextInt();
		
		 for (int i=1; i<=n; i++){
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome, email);
		 }
		 
		 System.out.println();
		 System.out.println("Quartos alugados: ");
		 for(int i = 0; i<10 ; i++) {
			 if(vect[i] != null) {
				 System.out.println(i + ": " + vect[i]);
			 }
		 }
		 
		sc.close();
	}	
}

