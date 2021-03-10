import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		double soma = 0;
		int cont = 0;
		
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont = cont + 1;
			}
		}
		
		double media = soma / cont;
		System.out.println("A média aritméticas do números pares digitados é "+ media);
		
		sc.close();
	}

}
