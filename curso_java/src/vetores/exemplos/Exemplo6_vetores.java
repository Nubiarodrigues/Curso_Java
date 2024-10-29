package vetores.exemplos;

import java.util.Scanner;

public class Exemplo6_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int countPares = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
	
		System.out.println();
		System.out.println("NÚMEROS PARES: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
				countPares++;
			}
			
		}
		
		System.out.println();
		System.out.printf("\nQUANTIDADE DE PARES = %d\n", countPares);
		

		sc.close();

	}

}
