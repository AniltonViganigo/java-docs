import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		String classificacao = sc.next();
		
		System.out.print("Informe a sua idade: ");
		idade = sc.nextInt();
		System.out.println();
		System.out.println("Classificação ");
		System.out.println("Livre - Digite 'L'.");
		System.out.println("Pré adolescente - Digite 'PA'.");
		System.out.println("Adolescente - Digite 'AD'.");
		System.out.println("Maior - Digite 'M'");
		System.out.print(" Informe a classificação do filme desejada: ");
		classificacao = sc.nextLine();
	
		if (idade <12 && classificacao == "L") {
			System.out.println("OK, você está apto a ver este filme.");
		}
		else if (idade < 12 && classificacao == "PA") {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		}
		else {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		}
		
		
		sc.close();
	}
	}


