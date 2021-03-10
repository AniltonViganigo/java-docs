import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número inteiro: ");
		
		int numero = sc.nextInt();
		int soma = 0;
		
		if (numero == 0) {
			System.out.println("Você digitou o número Zero!");
		}
		else {
		System.out.println("Digite um número inteiro!");
			numero = sc.nextInt();
		}
		while (numero != 0) {
			soma += numero;
		System.out.println("Digite outro número inteiro!");	
			numero = sc.nextInt();
		}
		
		System.out.println("A soma dos números digitados é: " + soma);
		sc.close();
	}

}
