package estrutura_condicional;

import java.util.Scanner;

public class Exe_04_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicioJogo = sc.nextInt();
		int finalJogo = sc.nextInt();
		
		int duracao;
		
		if(inicioJogo < finalJogo) {
			duracao = finalJogo - inicioJogo;
		}
		else {
			duracao = 24 - inicioJogo + finalJogo;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		
		sc.close();
	}

}
