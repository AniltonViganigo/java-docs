package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoFerias;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoFerias calculo = new CalculoFerias();
		
		System.out.println("Bem-vindo! Você está prestes a sair de férias! ");
		System.out.println("Vamos calcular o valor que você irá receber.");
		System.out.println();
		System.out.print("Digite o seu nome completo: ");
		calculo.name = sc.nextLine();
		System.out.print("Informe o seu salário bruto: R$ ");
		calculo.salarioBruto = sc.nextDouble();
		System.out.println();
		System.out.printf("Você receberá o valor de R$ %.2f%n", calculo.calculoFerias());
		System.out.println("Boas férias, " + calculo.name + "!");
		
				
		sc.close();
	}

}
