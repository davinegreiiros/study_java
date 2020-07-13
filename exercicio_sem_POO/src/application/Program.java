package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com os valores do triangulo de X: ");
		x.a = sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os valores do triangulo de Y: ");
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p* (p - x.a) * (p - x.b) * (p - x.c));
		
		 p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p* (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Area do triangulo de X: %.4f%n", areaX);
		System.out.printf("Area do triangulo de Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior largura é: X");
		}
		else {
			System.out.println("Maior largura é: Y");
		}

		sc.close();
	}

}
