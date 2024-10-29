package uri;

import java.util.Scanner;

public class exe_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();

		int min1;
		int min2 = 0;
		int min3 = 0;

		min1 = Math.min(valor1, Math.min(valor2, valor3));

		if (min1 == valor1) {
			min2 = Math.min(valor2, valor3);
			min3 = Math.max(valor2, valor3);
		}
		if (min1 == valor2) {
			min2 = Math.min(valor1, valor3);
			min3 = Math.max(valor1, valor3);
		}
		if (min1 == valor3) {
			min2 = Math.min(valor1, valor2);
			min3 = Math.max(valor1, valor2);
		}

		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		System.out.println("");
		System.out.printf("%d%n%d%n%d%n", valor1, valor2, valor3);

		sc.close();

	}

}
