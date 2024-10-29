package vetores.exemplos;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo9_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?  ");
		int n = sc.nextInt();
		
		double[] vetorNumeros = new double[n];
		
		for(int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Digite um numero: ");
			vetorNumeros[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < vetorNumeros.length; i++) {
			soma += vetorNumeros[i];
		}
		
		double media = soma / n;
		
		System.out.printf("MÉDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		for(int i = 0; i < vetorNumeros.length; i++) {
			if(vetorNumeros[i] < media) {
				System.out.printf("%.1f\n", vetorNumeros[i]);
			}
		}
		

		
		
		
		
		
		
		sc.close();

	}

}
