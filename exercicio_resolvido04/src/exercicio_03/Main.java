package exercicio_03;

import java.util.Scanner;

public class Main {
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n ;i++) {
			double teste1 = sc.nextDouble();
			double teste2 = sc.nextDouble();
			double teste3 = sc.nextDouble();
			
			double mediaPonderada = (teste1 * 2.0  + teste2 * 3.0 + teste3 * 5.0)/10;
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		
		sc.close();
	}
}
