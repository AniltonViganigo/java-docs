import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double p = 3.14159;
		double area = p * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n",area);
		
		sc.close();		
	}

}
