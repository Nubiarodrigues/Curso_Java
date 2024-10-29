package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int qnt1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		int codigo2 = sc.nextInt();
		int qnt2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double result = qnt1 * valor1 + qnt2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", result);

		
		sc.close();
	}

}
