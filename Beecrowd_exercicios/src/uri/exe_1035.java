package uri;

import java.util.Scanner;

public class exe_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		if (B > C && D > A) {
			int soma1 = C + D;
			int soma2 = A + B;
			
			if (soma1 > soma2) {
				if (soma1 > 0) {
					if (A % 2 == 0) {
						System.out.println("Valores aceitos");
					}
				}
			}
		}else {
			System.out.println("Valores não aceitos");
		}

		

		sc.close();

	}

}
