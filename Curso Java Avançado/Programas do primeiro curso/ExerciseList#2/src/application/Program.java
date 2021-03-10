package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("====== Bem-vindo ao Sistema de Cadastro do Colégio Laura Viñas Vigânigo ======");
		System.out.println();
		System.out.println("====== Acesso ======");
		System.out.println();
		System.out.print("Login: ");
		String login = sc.nextLine();
		System.out.print("Senha: ");
		int senha = sc.nextInt();
		System.out.println();
		System.out.println("====================");

		if (login.equals("sueellenlia") && senha == 160120) {
			System.out.println("Bem-vinda Sue Ellen.");
		} else {
			System.out.println();
			System.out.println("Login ou senha incorretos!");
			System.out.println("PROGRAMA ENCERRADO!");
			System.exit(0);
		}

		List<Student> list = new ArrayList<>();

		System.out.print("Digite o número de alunos que você deseja cadastrar: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Registro número: #" + i);
			System.out.print("Digite o número da matrícula: ");
			int matricula = sc.nextInt();

			while (hasMatricula(list, matricula)) {
				System.out.print("Esse número de matrícula já existe! Digite outro número de matrícula, por favor: ");
				matricula = sc.nextInt();
			}

			System.out.print("Informe o nome do aluno: ");
			sc.nextLine();
			String nomeAluno = sc.nextLine();
			System.out.print("Informe o valor da mensalidade: R$ ");
			double valorMensalidade = sc.nextDouble();
			list.add(new Student(nomeAluno, matricula, valorMensalidade));
		}
		System.out.println();
		System.out.print("Você deseja aumentar o valor da mensalidade (s/n)? ");
		char resp = sc.next().charAt(0);

		if (resp == 's') {
			System.out.println();
			System.out.print("Informe o número de matrícula do aluno: ");
			int matriculaAlt = sc.nextInt();
			Student aluno = list.stream().filter(x -> x.getNumeroMatricula() == matriculaAlt).findFirst().orElse(null);

			if (aluno == null) {
				System.out.println("Esse número de matrícula não existe!");
			} else {
				System.out.println();
				System.out.print("Informe o valor em Reais: R$ ");
				double aumento = sc.nextDouble();
				aluno.aumentoMensalidade(aumento);

			}

			System.out.println();
			System.out.println("Lista de alunos cadastrados:");
			System.out.println();
			for (Student obj : list) {
				System.out.println(obj);
			}
		} else {
			System.out.println();
			System.out.println("Lista de alunos cadastrados: ");
			for (Student obj : list) {
				System.out.println(obj);
			}
			System.out.println();
			System.out.println("Muito obrigado!");
		}

		sc.close();

	}

	private static boolean hasMatricula(List<Student> list, int matricula) {
		Student aluno = list.stream().filter(x -> x.getNumeroMatricula() == matricula).findFirst().orElse(null);
		return aluno != null;
	}

}
