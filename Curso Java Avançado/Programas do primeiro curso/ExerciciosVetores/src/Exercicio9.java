import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] mercadoria = new String[N];
		double[] valorCompra = new double[N];
		double[] valorVenda = new double[N];

		for (int i = 0; i < N; i++) {
			mercadoria[i] = sc.next();
			valorCompra[i] = sc.nextDouble();
			valorVenda[i] = sc.nextDouble();

		}

		int contLucro10 = 0;
		for (int i = 0; i < N; i++) {
			double lucro10 = valorVenda[i] - valorCompra[i];
			double porcentagem10 = lucro10 / valorCompra[i] * 100.0;
			if (porcentagem10 < 10.0) {
				contLucro10++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + contLucro10);

		int contEntre = 0;
		for (int i = 0; i < N; i++) {
			double lucroEntre = valorVenda[i] - valorCompra[i];
			double porcentagem20 = lucroEntre / valorCompra[i] * 100.0;
			if (porcentagem20 >= 10.0 && porcentagem20 <= 20.0) {
				contEntre++;
			}
		}
		System.out.println("Lucro entre 10% e 20%: " + contEntre);

		int contAcima = 0;
		for (int i = 0; i < N; i++) {
			double lucroAcima = valorVenda[i] - valorCompra[i];
			double porcentagemMaior20 = lucroAcima / valorCompra[i] * 100.0;
			if (porcentagemMaior20 > 20.0) {
				contAcima++;
			}
		}
		System.out.println("Lucro acima de 20%: " + contAcima);

		double totalCompras = 0;
		for (int i = 0; i < N; i++) {
			totalCompras = totalCompras + valorCompra[i];
		}
		System.out.println("Valor total de compras: " + totalCompras);

		double totalVendas = 0;
		for (int i = 0; i < N; i++) {
			totalVendas = totalVendas + valorVenda[i];
		}
		System.out.printf("Valor total de vendas: R$ %.2f%n", totalVendas);

		double lucroTotal = totalVendas - totalCompras;
		System.out.printf("Lucro total: R$ %.2f%n", lucroTotal);

		sc.close();
	}

}
