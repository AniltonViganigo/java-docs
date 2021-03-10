package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media notafinal = new Media();
		
		System.out.print("Digite o nome do aluno: ");
		notafinal.name = sc.next();
		System.out.print("Informe a primeira nota do aluno: ");
		notafinal.nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota do alundo: ");
		notafinal.nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota do aluno: ");
		notafinal.nota3 = sc.nextDouble();
		
		System.out.println();
		
		if (notafinal.notaFinal() > 60.0) {
			System.out.printf("Final grade = %.2f%n", notafinal.notaFinal());
			System.out.println("PASS!");
		}
		else {
			System.out.printf("Final grade = %.2f%n", notafinal.notaFinal());
			System.out.println("FAILED!");
			System.out.println("Sorry!");
			System.out.println("Missing " + notafinal.missingPoints() + " points.");
		}
			
		sc.close();
		
	}

}
