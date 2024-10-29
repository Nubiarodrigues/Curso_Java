package vetores.exemplos;

import java.util.Scanner;

public class Exemplo3_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		

		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
	
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();

	}

}
