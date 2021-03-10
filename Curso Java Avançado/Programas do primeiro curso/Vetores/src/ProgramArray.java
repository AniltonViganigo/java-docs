import java.util.Locale;
import java.util.Scanner;

public class ProgramArray {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		
		double media = soma / N;
		System.out.println(media);
		
		sc.close();
	}

}
