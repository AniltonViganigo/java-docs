import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro nome: ");
		String nome1 = sc.next();
		sc.nextLine();
		System.out.println("Digite o segundo nome: ");
		String nome2 = sc.next();
		sc.nextLine();
		
		System.out.printf("Digite a idade de %s:%n ", nome1);
		int idade1 = sc.nextInt();
		System.out.printf("Digite a idade de %s:%n ", nome2);
		int idade2 = sc.nextInt();
		
		System.out.printf("%s tem %d anos de idade.%n", nome1,idade1);
		System.out.printf("%s tem %d anos de idade.%n", nome2,idade2);
		
		double media = (double)(idade1 + idade2) / 2.0;
		
		System.out.printf("A média da idade de %s e de %s é %.2f%n ",nome1, nome2,media);
		
		sc.close();
	}

}
