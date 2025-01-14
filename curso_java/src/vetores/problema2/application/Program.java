package vetores.problema2.application;

import java.util.Scanner;

import vetores.problema2.entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno[] register = new Aluno[30];

		System.out.print("How many students want register? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Student nº " + (i + 1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Registration: ");
			int registration = sc.nextInt();
			System.out.print("Position: ");
			int position = sc.nextInt();

			register[position] = new Aluno(name, registration);

		}

		System.out.println();
		System.out.println("Registered students: ");
		for (int i = 0; i < 30; i++) {
			if (register[i] != null) {
				System.out.println(i + ": " + register[i]);
			}
		}

		sc.close();

	}

}
