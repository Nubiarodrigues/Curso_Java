package uri;

import java.util.Scanner;

public class exe_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		int R = sc.nextInt();
		
		double volumeEsfera = (4.0/3) * PI * R * R * R;
		
		System.out.printf("VOLUME = %.3f", volumeEsfera);

		sc.close();
	}

}
