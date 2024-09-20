package exemplo1_membrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*VERSÃO 1: MEMBROS NA PRÓPRIA CLASSE DO PROGRAMA
	 * NOTA: DENTRO DE UM MÉTODO ESTÁTICOS VOCÊ NÃO PODE 
	 * CHAMAR MEMBROS DE INSTÂNCIA NA MESMA CLASSE
	 * */
	
	public static final double PI = 3.14159; //DECLARAÇÃO DE CONSTANTES

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = circumferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circumferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);

		sc.close();

	}
	
	public static double circumferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
