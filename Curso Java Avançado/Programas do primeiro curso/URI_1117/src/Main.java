import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota inv�lida");
			nota1 = sc.nextDouble();
		}

		double nota2 = sc.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota inv�lida");
			nota2 = sc.nextDouble();
		}

		double media = (nota1 + nota2) / 2.0;
			System.out.printf("M�dia = %.2f%n", media);
		sc.close();

	}
}
