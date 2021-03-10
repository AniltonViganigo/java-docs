import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x <= y && x <= z) {
			System.out.println("O menor número digitado é: " + x);
		} 
		else if (y <= x && y <= z) {
			System.out.println("O menor número digitado é: " + y);
		}
			
		else {
			System.out.println("O menor número digitado é: " + z);
		}
			
			
		sc.close();
	}

}
