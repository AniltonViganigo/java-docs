package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoFerias;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoFerias calculo = new CalculoFerias();
		
		System.out.println("Bem-vindo! Voc� est� prestes a sair de f�rias! ");
		System.out.println("Vamos calcular o valor que voc� ir� receber.");
		System.out.println();
		System.out.print("Digite o seu nome completo: ");
		calculo.name = sc.nextLine();
		System.out.print("Informe o seu sal�rio bruto: R$ ");
		calculo.salarioBruto = sc.nextDouble();
		System.out.println();
		System.out.printf("Voc� receber� o valor de R$ %.2f%n", calculo.calculoFerias());
		System.out.println("Boas f�rias, " + calculo.name + "!");
		
				
		sc.close();
	}

}
