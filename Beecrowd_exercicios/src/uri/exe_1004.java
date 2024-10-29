package uri;

import java.util.Scanner;

public class exe_1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qnt = sc.nextInt();
		int valor = sc.nextInt();
		
		int PROD = qnt * valor;
		
		System.out.println("PROD = " + PROD);

		sc.close();
	}

}
