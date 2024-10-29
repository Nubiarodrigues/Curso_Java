package membros_estaticos.problema2.application;
import java.util.Locale;
import java.util.Scanner;

import membros_estaticos.problema2.entities.Calcular;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		//USANDO MEMBROS ESTÁTICOS SEM INSTÂNCIA, APENAS CHAMANDO A CLASSE
		double c = Calcular.circumferencia(raio);
		double v = Calcular.volume(raio);
		
		System.out.printf("Circumferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calcular.PI);

		sc.close();

	}
	


}


