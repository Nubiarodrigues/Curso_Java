package estrutura_repeticao;

import java.util.Scanner;

public class Exe_09_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = 0;
		int Y = 0;

		while ((X = sc.nextInt()) != 0 && (Y = sc.nextInt()) != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
		}

		sc.close();

	}

}
