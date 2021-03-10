import java.util.Scanner;

public class ExerciseChapter2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matrix = new int[M][N];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position: " + "(" + i + "," + j + ")");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + matrix[i - 1][j]);
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
