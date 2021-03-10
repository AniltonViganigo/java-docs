import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoVetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // declarou a variável para entrada de dados//
		double[] vet = new double[N]; // declarou o vetor e definiu o tamanho//

		for (int i = 0; i < N; i++) { // informando os dados para o vetor//
			vet[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) { // imprimindo os valores informados//
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		
		double soma = 0.0;
		for (int i=0; i<N; i++) { // somando os valores informados//
			soma = soma + vet[i];
		}
		
		System.out.printf("%.2f%n", soma);
		
		double media = soma / N; // realizando o cálculo da média dos valores informados//
		System.out.printf("%.2f%n", media);

		sc.close();
	}

}
