package vetores.problema1.application;

import java.util.Locale;
import java.util.Scanner;

import vetores.problema1.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//PROBLEMA USANDO TIPO REFERÊNCIA, QUE NESTE CASO SERÁ O MEU PRODUTO
		int n = sc.nextInt();
		
		//CRIANDO VETOR DO TIPO PRODUTO
		Produto[] vect = new Produto[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine(); //CONSUMIR ENTRADA ANTERIOR
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco); //PASSANDO OS VALORES PARA MEU CONSTRUTOR E PARA O VETOR
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVEREGE PRICE = %.2f%n", avg);
		
		
		
		sc.close();

	}

}
