import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horas = sc.nextDouble();
		double velocidade = sc.nextDouble();
		
		double consumo = (horas * velocidade) / 12.0;
		
		System.out.printf("%.3f%n", consumo);
		
		sc.close();
	}

}
