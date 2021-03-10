import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá! ");
		System.out.println("Bem-vindo(a) ao NewFlix");
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		System.out.println("Digite a categoria do filme desajado:");
		System.out.println("L  - Livre. ");
		System.out.println("PA - Pré adolescente. ");
		System.out.println("AD - Adolescente. ");
		System.out.println("MI - Maior idade. ");
		String categoria = sc.next();

		if (idade < 12 && categoria == "L") {
			System.out.println("Ok, você está apto a ver este filme.");
		} else if (idade <= 12 && categoria == "PA") {
			System.out.println("Desculpe, este título não está disponivel para a sua idade.");

		} else if (idade <= 12 && categoria == "AD") {
			System.out.println("Desculpe, este título não está disponivel para a sua idade.");

		} else if (idade <=12 && categoria == "MI") {
			
		}

		
		
			sc.close();

	}

}
