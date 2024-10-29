package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe_02_curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double R = sc.nextDouble();
		
		double area = PI * R * R;
		
		System.out.printf("A = %.4f", area);

	}

}
