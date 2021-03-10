package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();// declarou e instanciou uma nova lista//

		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println(); // l�gica que incrementa o ID dos funcion�rios//
			System.out.println("Employee #" + i + ":");

			System.out.print("ID:");
			int id = sc.nextInt(); // l�gica que verifica se j� existe o ID informado//
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); // l�gica para cadastrar o nome do funcion�rio//
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(name, id, salary)); // faz o link com a Classe criada(Employee)//
		}

		System.out.println(); // l�gica para informar o id e conceder o aumento de salario//
		System.out.print("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // l�gica que verifica se o
																							// id existe//
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble(); // incrementa o aumento ao salario do funcion�rio//
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:"); // l�gica para listar os funcion�rios cadastrados//
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	// esse comando cria o m�todo hasID usado na l�gica while//
	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
