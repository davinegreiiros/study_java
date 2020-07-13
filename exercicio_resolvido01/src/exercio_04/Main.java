package exercio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double calculo = horasTrabalhadas * valorHora;
		
		System.out.println("Número Funcionario = " + numFuncionario);
		System.out.printf("Salario = %.2f%n",calculo);
		
		sc.close();
	}

}
