package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salaryEmployee = sc.nextDouble();

		if (salaryEmployee >= 0 && salaryEmployee <= 400.00) {
			double resultIncrease = salaryEmployee * (15.0 / 100);
			double resultSalary = resultIncrease + salaryEmployee;

			System.out.printf("Novo salário: R$ %.2f\n", resultSalary);
			System.out.printf("Reajuste ganho:  R$ %.2f\n", resultIncrease);
			System.out.println("Em percentual: 15 %");
		}

		else if (salaryEmployee >= 400.01 && salaryEmployee <= 800.00) {
			double resultIncrease = salaryEmployee * (12.0 / 100);
			double resultSalary = resultIncrease + salaryEmployee;

			System.out.printf("Novo salário: R$ %.2f\n", resultSalary);
			System.out.printf("Reajuste ganho:  R$ %.2f\n", resultIncrease);
			System.out.println("Em percentual: 12 %");
		}

		else if (salaryEmployee >= 800.01 && salaryEmployee <= 1200.00) {
			double resultIncrease = salaryEmployee * (10.0 / 100);
			double resultSalary = resultIncrease + salaryEmployee;

			System.out.printf("Novo salário: R$ %.2f\n", resultSalary);
			System.out.printf("Reajuste ganho:  R$ %.2f\n", resultIncrease);
			System.out.println("Em percentual: 10 %");
		}

		else if (salaryEmployee >= 1200.01 && salaryEmployee <= 2000.00) {
			double resultIncrease = salaryEmployee * (7.0 / 100);
			double resultSalary = resultIncrease + salaryEmployee;

			System.out.printf("Novo salário: R$ %.2f\n", resultSalary);
			System.out.printf("Reajuste ganho:  R$ %.2f\n", resultIncrease);
			System.out.println("Em percentual: 7 %");
		}

		else {
			double resultIncrease = salaryEmployee * (4 / 100);
			double resultSalary = resultIncrease + salaryEmployee;

			System.out.printf("Novo salário: R$ %.2f\n", resultSalary);
			System.out.printf("Reajuste ganho:  R$ %.2f\n", resultIncrease);
			System.out.println("Em percentual: 4 %");
		}

		sc.close();

	}

}
