package vetores.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemplo1_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEL QUE VAI RECEBER O NUMERO DE ENTRADAS NO MEU VETOR
		int n = sc.nextInt();
		//CRIANDO VETOR DO TIPO DOUBLE COM O TAMANHO Q O USUÁRIO PREFERIR
		double[] vect = new double[n];
		
		for(int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble(); //VAI LER OS N VALORES
		}
		
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			sum += vect[i]; //VAI SOMAR A CADA LEITURA DE ENTRADA
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		
		
		
		sc.close();

	}

}
