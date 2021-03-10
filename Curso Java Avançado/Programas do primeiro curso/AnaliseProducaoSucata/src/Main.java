import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da máquina MM: ");
		int maquina = sc.nextInt();
		System.out.println("Informe o turno: ");
		int turno = sc.nextInt();
		System.out.printf("Informe a produção realizada no %d:%n", turno);
		int prod = sc.nextInt();
		System.out.println("Informe a quantidade de sucatas geradas no turno;");
		int sucata = sc.nextInt();
		
		double nrft = 3*1000000; 
		double metaNrft = 12.978;
		int capacidade;
		
		System.out.println(nrft);
		
		
		sc.close();
	}

}
