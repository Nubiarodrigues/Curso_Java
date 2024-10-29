package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();

		double media3 = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		if (media3 >= 7.0) {
			System.out.printf("Media: %.1f%n", media3);
			System.out.println("Aluno aprovado.");
		} else if (media3 < 5.0) {
			System.out.printf("Media: %.1f%n", media3);
			System.out.println("Aluno reprovado.");
		} else if (media3 >= 5.0 && media3 <= 6.9) {
			System.out.printf("Media: %.1f%n", media3);
			System.out.println("Aluno em exame.");
			double NF = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", NF);
			double recalculo = (media3 + NF) / 2;

			if (recalculo >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", recalculo);
			} else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", recalculo);
			}
		}

		sc.close();
	}
}