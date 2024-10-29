package vetores.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo10_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vetorNumero = new int[n];

		for (int i = 0; i < vetorNumero.length; i++) {
			System.out.printf("Digite um numero: ");
			vetorNumero[i] = sc.nextInt();
		}

		double soma = 0.0;
		int numPares = 0;

		for (int i = 0; i < vetorNumero.length; i++) {
			if (vetorNumero[i] % 2 == 0) {
				soma += vetorNumero[i];
				numPares++;
			}
		}

		if (numPares > 0) {
			double media = soma / numPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();

	}

}
