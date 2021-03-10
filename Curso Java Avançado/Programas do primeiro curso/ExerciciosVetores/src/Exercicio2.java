import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int [N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		int cont = 0;
		
		for (int i=0; i<N; i++) {
			if (vet[i] % 2 == 0) {
				cont = cont +1;
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();
		
		System.out.printf("Quantidade de números pares digitados: %d%n",cont);
		
		sc.close();
	}

}
