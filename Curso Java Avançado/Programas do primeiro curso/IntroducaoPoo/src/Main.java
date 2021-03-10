import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the measuresof triangle X:");
		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();

		System.out.println("Enter the measuresof triangle y:");
		double ay = sc.nextDouble();
		double by= sc.nextDouble();
		double cy= sc.nextDouble();

		
		double px = (ax + bx + cx) / 2;
		double areaX = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));
		
		double py = (ay + by + cy) / 2;
		double areaY = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
