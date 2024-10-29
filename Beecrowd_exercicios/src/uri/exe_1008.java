package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFunc = sc.nextInt();
		int horasTrabalh = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double calcSalario = horasTrabalh * valorHora;
		
		System.out.println("NÚMERO = " + numeroFunc);
		System.out.printf("SALÁRIO = U$ %.2f", calcSalario);

		
		sc.close();
	}

}
