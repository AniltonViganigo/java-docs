import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//meu primeiro programa com a estrutura switch-case//
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Ter�a-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Voc� digitou um valor inv�lido!";
			break;
		}
			System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
