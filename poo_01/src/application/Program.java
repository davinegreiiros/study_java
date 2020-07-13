package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com largura e altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.areaRetangulo());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetroRetangulo());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonalRetangulo());

	}

}
