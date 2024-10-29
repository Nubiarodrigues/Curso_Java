package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1006 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double media2 = (A * 2.0 + B * 3.0 + C * 5.0) / 10;

			System.out.printf("MEDIA = %.1f", media2);

			
			sc.close();
	}

}
