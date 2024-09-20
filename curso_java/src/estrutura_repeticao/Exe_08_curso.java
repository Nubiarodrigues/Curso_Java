package estrutura_repeticao;

import java.util.Scanner;

public class Exe_08_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senha = sc.nextInt();
		
		while (senhaCorreta != senha) {
			System.out.println("Senha invalida ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		
		sc.close();

	}

}
