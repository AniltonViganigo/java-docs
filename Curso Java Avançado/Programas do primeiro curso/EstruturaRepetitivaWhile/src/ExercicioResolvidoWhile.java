import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		int idade = sc.nextInt();
		
		int soma = 0;
		int cont = 0;
		
		while (idade >= 0) {
				soma = soma + idade;
				cont = cont + 1;
				idade = sc.nextInt();
			}
		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("Voc� digitou um n�mero negativo!! Imposs�vel calcular.");
		}
		
		sc.close();
	}

}
