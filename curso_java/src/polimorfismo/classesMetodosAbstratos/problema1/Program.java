package polimorfismo.classesMetodosAbstratos.problema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contributors> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char response = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (response == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PersonPhysical(name, anualIncome, healthExpenditures));
			}

			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PersonLegal(name, anualIncome, numberEmployees));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID: ");

		for (Contributors ct : list) {
			System.out.println(ct);
		}

		double sum = 0.0;
		for (Contributors ct : list) {
			sum += ct.tax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", sum);

		sc.close();

	}

}
