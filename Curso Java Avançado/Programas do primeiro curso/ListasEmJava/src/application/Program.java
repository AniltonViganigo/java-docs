package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // declarando e instanciando uma list.//

		list.add("Maria");
		list.add("Alex");
		list.add("Anilton");
		list.add("Laura");
		list.add(2, "Sue Ellen");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("=======================================");
		list.removeIf(x -> x.charAt(0) == 'A'); // predicado em função Lambda//

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("=======================================");
		System.out.println("Index of Bob: " + list.indexOf("Laura")); // esse comando verifica o elemento e informa a
																		// posição//
		System.out.println("Index of Bob: " + list.indexOf("Anilton"));
		System.out.println("=======================================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		// o comando acima add nova lis e filtra os elementos que inicie com a letra
		// 'L'//
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("=======================================");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		// o comando acima find the first name of the list with 'J'//

		System.out.println(name);

	}
}
