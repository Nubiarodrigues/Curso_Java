package uri;
import java.util.Scanner;
import java.util.Locale;

public class exe_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double R = sc.nextDouble();
		
		double areaCirculo = PI * R * R;
		
		System.out.printf("A=%.4f%n", areaCirculo);

		sc.close();
	}

}
