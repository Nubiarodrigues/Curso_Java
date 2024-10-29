package vetores.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo12_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] bimestre1 = new double[n];
		double[] bimestre2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			bimestre1[i] = sc.nextDouble();
			bimestre2[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("Alunos aprovados: ");
		double media = (bimestre1[0] + bimestre2[0]) / 2.0;

		for (int i = 0; i < n; i++) {
			media = (bimestre1[i] + bimestre2[i]) / 2;
			if (media >= 6) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		sc.close();

	}

}
