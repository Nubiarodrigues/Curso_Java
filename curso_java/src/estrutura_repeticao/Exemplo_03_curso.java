package estrutura_repeticao;

import java.util.Scanner;

public class Exemplo_03_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 123456;
		
		int input = sc.nextInt();
		
		while(input != senha) {
			System.out.println("Senha incorreta!!");
			input = sc.nextInt();
		}
		
		System.out.println("Senha correta!!");
		
		
		sc.close();

	}

}
