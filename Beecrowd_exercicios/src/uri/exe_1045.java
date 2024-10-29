package uri;
import java.util.Locale;
import java.util.Scanner;

public class exe_1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		
		if(a > b + c) {
			System.out.println("NÃO FORMA TRIÂNGULO");
		}else if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIÂNGULO RETANGULO");
		}else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIÂNGULO OBTUSANGULO");
		}else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIÂNGULO ACUTANGULO");
		}else if(a == b && b == c && a == c) {
			System.out.println("TRIÂNGULO EQUILATERO");
		}else if(a == b && c != a && c != b) {
			System.out.println("TRIÂNGULO ISOSCÉLICOS");
		}
		
		
		
		sc.close();

	}

}
