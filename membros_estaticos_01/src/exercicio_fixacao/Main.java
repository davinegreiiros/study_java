package exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual � o pre�o do dolar? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantos dolares seram comprados? ");
		double amount = sc.nextDouble();
		double resultado = CorrecaoMoeda.dollarToReal(amount,dollarPrice);
		System.out.printf("Valor a ser pago em reais: %.2f%n" , resultado);
	}

}
