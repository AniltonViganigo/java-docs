import java.util.Scanner;

public class Main {
		private static final String mensagemOk = "Ok, voc� est� apto a ver esse filme.";
		private static final String mensagemNOk = "Desculpe, este t�tulo n�o est� dispon�vel para a sua idade.";
		
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();

		System.out.println();
		System.out.println("                   Classifica��o indicativa                    ");
		System.out.println("===============================================================");
		System.out.println("        Para a classifica��o LIVRE.('L')                       ");
		System.out.println("        Para a classifica��o PR� ADOLESCENTE. ('PA').          ");
		System.out.println("        Para a classifica��o ADOLESCENTE. ('AD').              ");
		System.out.println("        Para a classifica��o MAIOR. ('MI').                    ");
		System.out.println("        Para sair, digite 'S'.                                 ");
		System.out.println("===============================================================");
		System.out.print("Informe a classifica��o do filme desejada: ");
		String classificacao = sc.next();
		
		if (classificacao.equals("S")) {
			System.out.println();
			System.out.println("Programa encerrado!");
			System.exit(0);
		}

		System.out.println();

		Boolean apto = classificacao.equals("L") ||
			(classificacao.equals("PA") && idade >=12) ||
			(classificacao.equals("DA") && idade >=14) ||
			(classificacao.equals("MI") && idade >=18); 

		if (apto == true) {
			System.out.println(mensagemOk);
		}
		else {
			System.out.println(mensagemNOk);
		}

		

		sc.close();
	}  
}

