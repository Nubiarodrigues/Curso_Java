package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double perimetro = A + B + C;
		double area = ((A + B) * C) / 2;
		
		if((A < B + C) && (B < A + C) && (C < A + B)) {
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}else {
			System.out.printf("Area = %.1f\n", area);
		}
			
		
		sc.close();

	}

}

