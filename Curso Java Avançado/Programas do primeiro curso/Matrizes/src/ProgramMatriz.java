import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] matrix = new int[N][N];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = sc.nextInt();
		}
		System.out.println("Main diagonal:");
			
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println();
		
		int cont=0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Negative numbers: " + cont);
		
		
		sc.close();
	}

}
