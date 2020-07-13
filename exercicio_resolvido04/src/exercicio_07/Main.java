package exercicio_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<n ;i++) {
			int primeiro = i;
			int segundo = i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiro,segundo,terceiro);
		}

	}

}
