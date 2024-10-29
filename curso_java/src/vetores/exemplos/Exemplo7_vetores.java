package vetores.exemplos;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo7_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vetorNumeros = new double[n];


		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Digite um numero: ");
			vetorNumeros[i] = sc.nextDouble();
		}
		
		double maiorNumero = vetorNumeros[0];
		int posicao = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] > maiorNumero) {
				maiorNumero = vetorNumeros[i];
				posicao = i;;
			}
		}
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", maiorNumero);
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicao);

		sc.close();

	}

}
