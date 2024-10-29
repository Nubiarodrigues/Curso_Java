package vetores.exemplos;

import java.util.Scanner;

public class Exemplo11_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		String nome = nomes[0];
		int maiorIdade = idades[0];

		for (int i = 0; i < n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				nome = nomes[i];
			}

		}

		System.out.printf("PESSOA MAIS VELHA: " + nome);

		sc.close();

	}

}
