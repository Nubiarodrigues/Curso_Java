package membros_estaticos.problema1.application;
import java.util.Locale;
import java.util.Scanner;

import membros_estaticos.problema1.entities.Calcular;

public class Program {

	/*VERSÃO 2: CRIAÇÃO DA CLASSE CALCULAR COM MEMBROS DE INSTANCIA
	 * EM CLASSES ESTÁTICAS SÓ PODE USAR CLASSES NÃO ESTÁTICAS
	 * ATRAVÉS DE INSTÂNCIAS
	 * */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calcular cal = new Calcular();
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = cal.circumferencia(raio);
		double v = cal.volume(raio);
		
		System.out.printf("Circumferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", cal.PI);

		sc.close();

	}
	


}

