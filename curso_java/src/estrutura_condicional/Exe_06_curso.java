package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe_06_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double intervaloUser = sc.nextDouble();
		
		if(intervaloUser > 0 && intervaloUser <= 25) {
			System.out.println("INTERVALO [0,25]");
		}
		else if(intervaloUser > 25 && intervaloUser <= 50) {
			System.out.println("INTERVALO [25,50]");
		}
		else if(intervaloUser > 75 && intervaloUser <= 100) {
			System.out.println("INTERVALO [75,100]");
		}
		else {
			System.out.println("FORA DO INTERVALO!!");
		}
		
		
		
		sc.close();
	}

}
