import java.util.Scanner;

public class Exemplo4_EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner teste = new Scanner(System.in);
		String nome;
		int idade;	
		
		System.out.println("Digite o seu primeiro nome:");
		nome = teste.nextLine();
		System.out.printf("Ol�, %s!!%n", nome);
		System.out.println("Informe a sua idade:");
		idade = teste.nextInt();
		System.out.printf("Voc� tem %d anos, %s.", idade, nome);
				
		teste.close();
	}

}
