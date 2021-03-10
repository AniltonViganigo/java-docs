import java.util.Locale;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner terreno = new Scanner(System.in);

		double area, largura, comprimento, preco, mq;
		
		System.out.println("Informe a largura do terreno: ");
		largura = terreno.nextDouble();
		terreno.nextLine();
		System.out.println("Informe o comprimento do terreno: ");
		comprimento = terreno.nextDouble();
		terreno.nextLine();		
		System.out.println("Informe o valor do metro quadrado: ");
		mq = terreno.nextDouble();
		terreno.nextLine();
		System.out.println("====== DADOS INFORMADOS ==============================");
		
		System.out.printf("Largura do terreno: %.1f%n", largura);
		System.out.printf("Comprimento do terreno: %.1f%n", comprimento);
		System.out.printf("O valor do metro quadrado é de R$ %.2f%n", mq);
		System.out.println("");
		System.out.println("====== VALORES CALCULADOS ============================");
		
		Locale.setDefault(Locale.US);
		area = largura * comprimento;
		preco = area * mq;		
		
		System.out.printf("Área total do terreno: %.2f%n", area);
		System.out.printf("O valor do terreno é R$ %.2f", preco);
		
		terreno.close();
	}

}
