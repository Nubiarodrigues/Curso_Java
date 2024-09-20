package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_04_curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int idade = sc.nextInt();
		int idades = 0; //VARIAVÉL PARA ARMAZENAR AS IDADES
		int contador = 0; //QUANTIDADE DE IDADES INFORMADAS
		
		while(idade > 0) {
			idades += idade;
			contador++;
			idade = sc.nextInt();	
		}
		
		if(contador > 0) {
			double mediaIdade = (double)idades / contador;
			System.out.printf("Média das idades informadas: %.1f", mediaIdade);
		}
		
		
		sc.close();

	}

}
