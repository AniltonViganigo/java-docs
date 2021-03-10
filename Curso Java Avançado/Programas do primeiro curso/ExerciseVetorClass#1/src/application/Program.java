package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.RentRooms;

public class Program {

	public static void main(String[] args)  throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		System.out.println();

		RentRooms[] vect = new RentRooms[10];

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Rent: #" + i + " : ");
			System.out.println();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			vect[room] = new RentRooms(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 1; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();

	}

}
