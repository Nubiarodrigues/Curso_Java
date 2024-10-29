package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int xDistancia = sc.nextInt();
		double yCombustivel = sc.nextDouble();
		
		double consumo = xDistancia / yCombustivel;
		
		System.out.printf("%.3f km/l", consumo);

		
		sc.close();
	}

}
