import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um n�mero inteiro: ");
		
		int numero = sc.nextInt();
		int soma = 0;
		
		if (numero == 0) {
			System.out.println("Voc� digitou o n�mero Zero!");
		}
		else {
		System.out.println("Digite um n�mero inteiro!");
			numero = sc.nextInt();
		}
		while (numero != 0) {
			soma += numero;
		System.out.println("Digite outro n�mero inteiro!");	
			numero = sc.nextInt();
		}
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		sc.close();
	}

}
