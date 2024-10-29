package estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exe_06_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double PI = 3.14159;
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTriangulo = A * C / 2;
		double areaCirculo = PI * C * C;
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("TRIÂNGULO = %.3f%n", areaTriangulo);
		System.out.printf("CÍRCULO = %.3f%n", areaCirculo);
		System.out.printf("TRAPÉZIO = %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETÂNGULO = %.3f%n", areaRetangulo);

		sc.close();
	}
}
