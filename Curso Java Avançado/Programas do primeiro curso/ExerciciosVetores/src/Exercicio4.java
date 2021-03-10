import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		double soma = 0;
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}
				
		double media = soma / N;
		
		System.out.printf("Média dos valores informados: %.3f%n", media);
		System.out.println();
		
		for (int i=0; i<N; i++) {
			if (vet[i] < media) {
				System.out.print(vet[i] + " ");
			}
		}
		
		
		
		sc.close();
	}

}
