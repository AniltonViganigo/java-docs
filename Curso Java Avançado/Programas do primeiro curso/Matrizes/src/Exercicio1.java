import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] matriz = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("Diagonal principal:");
		
		for (int i =0; i<N; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for (int i = 0; i<N; i++) {
			for (int j = 0; j<N; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Quantidade de números negativos: " + cont);
		
		sc.close();
	}

}
