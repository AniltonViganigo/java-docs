import java.util.Scanner;

public class ExercicioMatrizes5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mA = new int[M][N];
		int[][] mB = new int[M][N];
		int[][] mC = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mB[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mC[i][j] = mA[i][j] + mB[i][j];
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(mC[i][j] + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
