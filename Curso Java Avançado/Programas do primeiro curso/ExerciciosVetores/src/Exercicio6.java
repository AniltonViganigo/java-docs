import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		
		for (int i=0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = idade[0];
		int posicaoMaior = 0;
		
		for (int i=0; i<N; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("Pessoa mais velha é " + nome[posicaoMaior]);
		sc.close();
		
	}

}
