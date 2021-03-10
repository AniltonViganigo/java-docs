import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		//Mais informações sobre funções matemáticas em Java: java.lang.Math//
		Scanner formula = new Scanner(System.in);
		double delta, a,b,c, x1, x2;
		
		System.out.println("Digite o valor de 'a': ");
		a = formula.nextDouble();
		formula.nextLine();
		System.out.println("Digite o valor de 'b': ");
		b = formula.nextDouble();
		formula.nextLine();
		System.out.println("Digite o valor de 'c': ");
		c = formula.nextDouble();
		formula.nextLine();

		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.printf("O valor de X1 é: %.2f%n",x1);
		System.out.printf("O valor de X2 é: %.2f ",x2);
		
		formula.close();
	}

}
