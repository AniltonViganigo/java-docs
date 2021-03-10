import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resto, dia, meses,anos;
		
		int idade = sc.nextInt();
		
		anos = idade / 365;
		resto = idade % 365;
		meses = resto / 30;
		dia = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();
	}

}
