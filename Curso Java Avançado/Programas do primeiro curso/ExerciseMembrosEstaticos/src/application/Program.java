package application;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantidade = sc.nextDouble();
				
		double result = CurrencyConverter.dollarToReal(price, quantidade);
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", result);

		sc.close();
	}

}
