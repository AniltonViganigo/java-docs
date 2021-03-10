package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Account conta;
		
		System.out.print("Login:");
		String login = sc.nextLine();
		System.out.print("Senha:");
		int senha = sc.nextInt();
				
		if (login.equals("Anilton") && senha == 2207 ) {
			System.out.println("Bem-vindo ao Banco XXX, " + login + ".");
		}
		else {
			System.out.println("Login ou senha incorretos!");
		} 
		
		System.out.print("Deseja cadastrar uma nova conta (s/n)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Digite o número da conta: ");
			int numeroConta = sc.nextInt();
			System.out.print("Digite o nome do titular da conta: ");
			String usuario = sc.next();
			System.out.println("Deseja realizar um depósito inicial (s/n)? ");
			
			if (resposta == 's') {
				System.out.println("Informe o valor do deposito inicial: ");
				double deposito = sc.nextDouble();
				conta = new Account(usuario, numeroConta, deposito);
			}
			else {
				conta = new Account(usuario, numeroConta);
			}
		}
		else {
			System.out.println("Obrigado por escolher o Banco XXX.");
		}
		
		
		sc.close();
	}

}
