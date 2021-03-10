import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valortotal = (valor1 * quantidade1) + (valor2 * quantidade2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valortotal);
		
		sc.close();
	}

}
