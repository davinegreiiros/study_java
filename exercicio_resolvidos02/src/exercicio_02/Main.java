package exercicio_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("N�mero Par");
		}else {
			System.out.println("N�mero Impar");
		}
		
		sc.close();
	}

}
