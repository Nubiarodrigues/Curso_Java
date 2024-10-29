package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		int quilometrosTotal = tempoGasto * velocidadeMedia;
		double litrosUsados = quilometrosTotal / 12.0;
		
		System.out.printf("%.3f", litrosUsados);
		
		sc.close();

	}

}
