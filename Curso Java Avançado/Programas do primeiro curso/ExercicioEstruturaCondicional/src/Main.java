import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x <= y && x <= z) {
			System.out.println("O menor n�mero digitado �: " + x);
		} 
		else if (y <= x && y <= z) {
			System.out.println("O menor n�mero digitado �: " + y);
		}
			
		else {
			System.out.println("O menor n�mero digitado �: " + z);
		}
			
			
		sc.close();
	}

}
