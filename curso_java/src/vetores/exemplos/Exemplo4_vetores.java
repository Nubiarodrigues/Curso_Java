package vetores.exemplos;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo4_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			System.out.println();
			
		}
	
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);
		
		
		
		
		sc.close();

	}

}
