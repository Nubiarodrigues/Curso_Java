package uri;

import java.util.Scanner;

public class exe_1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int S = sc.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + S + Math.abs(maiorAB - S)) / 2;

		System.out.println(maiorABC + " eh o maior ");
		
		sc.close();
	}

}
