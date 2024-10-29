package estrutura_repeticao;

import java.util.Scanner;

public class Exe_02_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = 0;
		int out = 0;

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();

			if (X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);

	}

}
