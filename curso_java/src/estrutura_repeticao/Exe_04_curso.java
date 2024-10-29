package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exe_04_curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(y == 0) {
				System.out.println("divisão impossível!!");
			}else {
				System.out.printf("%.1f\n", x / y);
			}
		}
		
		
		sc.close();

	}

}