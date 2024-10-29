package matrizes;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // instancia matriz na memória

		// A utilização de dois loops 'for' ocorre porque o externo
		// percorre as colunas da matriz e o interno percorre as linhas.
		// Neste caso, o valor é acrescentado em cada posição da coluna.

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		// for usado para pegar os numeros negativos
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Negative numbers = " + count);

	}

}
