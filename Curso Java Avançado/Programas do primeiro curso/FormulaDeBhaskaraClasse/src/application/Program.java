package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bhaskara;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bhaskara bhaskara = new Bhaskara();

		System.out.println("Olá! Você acessou o programa para calucular a fórmula de Bhaskara.");
		System.out.println();
		System.out.print("Digite o valor de (a): ");
		bhaskara.a = sc.nextDouble();
		System.out.print("Digite o valor de (b): ");
		bhaskara.b = sc.nextDouble();
		System.out.print("Digite o valor de (c): ");
		bhaskara.c = sc.nextDouble();
		System.out.println();

		System.out.printf("Raiz 1 = %.2f%n", bhaskara.calculaRaiz1());
		System.out.printf("Raiz 2 = %.2f%n", bhaskara.calculaRaiz2());

		sc.close();
	}

}
