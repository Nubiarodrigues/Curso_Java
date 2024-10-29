package uri;

import java.util.Scanner;

public class exe_1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		double valorPagar = 0;
		
		switch(X) {
		case 1:
			valorPagar = 4.0 * Y;
			break;
			
		case 2:
			valorPagar = 4.50 * Y;
			break;

		case 3:
			valorPagar = 5.0 * Y;
			break;
		
		case 4:
			valorPagar = 2.0 * Y;
			break;
		
		case 5:
			valorPagar = 1.50 * Y;
			break;
		}
		
		System.out.printf("Total: R$ %.2f", valorPagar);
					
		sc.close();

	}

}
