package exercicio_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("divis�o impossivel");
			}else {
				double calculo = (double) x / y;
				System.out.printf("%.1f%n", calculo);
			}
		}
		
		
		sc.close();
	}

}
