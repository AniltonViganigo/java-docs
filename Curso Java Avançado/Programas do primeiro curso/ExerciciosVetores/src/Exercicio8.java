import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] sexo = new char[N];

		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}

		double maiorAltura = altura[0];
		for (int i = 0; i < N; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		System.out.printf("Maior altura: %.2f%n", maiorAltura);

		double menorAltura = altura[0];
		for (int i = 0; i < N; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		System.out.printf("Menor altura: %.2f%n", menorAltura);
		
		double somaAlturaF = 0.0;
		int contF = 0;
		
		for (int i=0; i<N; i++) {
			if (sexo[i] == 'F') {
				somaAlturaF = somaAlturaF + altura[i];
				contF++;
			}
			
		}
		if (contF == 0) {
			System.out.println("Não há nenhuma mulher entre as pessoas. ");
		}
		else {
			double media = somaAlturaF / contF;
			System.out.printf("Média das alturas das mulheres: %.2f%n", media);
		}
		
		int contM = 0;
		for (int i=0; i<N; i++) {
			if(sexo[i] == 'M') {
				contM++;
			}
		}
		System.out.println("Número de homens: " + contM);
		sc.close();
	}

}
