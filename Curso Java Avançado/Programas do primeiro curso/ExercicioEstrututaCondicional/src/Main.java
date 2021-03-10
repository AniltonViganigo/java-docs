import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		int matricula;
		
		System.out.println("Digite o nome do aluno(a): ");
		String nome = sc.next();
		sc.nextLine();
		System.out.printf("Digite o número da matrícula do aluno(a) %s:%n",nome);
		matricula = sc.nextInt();
		System.out.printf("Digite a primeira nota do aluno(a) %s:%n",nome);
		nota1 = sc.nextDouble();
		System.out.printf("Digite a segunda nota do aluno(a) %s:%n",nome);
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		if (notaFinal >= 6.0) {
			System.out.printf("Nota final = %.1f%n", notaFinal);
			System.out.printf("O aluno %s, matrícula %d está aprovado!", nome, matricula);
		}
		else {
			System.out.printf("Nota final = %.1f%n", notaFinal);
			System.out.printf("O aluno(a) %s, matrícula %d está reprovado!", nome, matricula);
		}
		
		sc.close();
	}

}
