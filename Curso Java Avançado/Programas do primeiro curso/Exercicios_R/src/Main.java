import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		double area = x * y;
		double p = 2.0*x + 2.0*y;
		double d = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
		
		System.out.printf("ÁREA = %.4f%n", area);
		System.out.printf("PERÍMETRO = %.4f%n",p);
		System.out.printf("DIAGONAL = %.4f%n",d);
		
		
		
		sc.close();
	}

}
