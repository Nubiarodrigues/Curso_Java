package estrutura_condicional;

import java.util.Scanner;

public class Exe_01_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		
		sc.close();

	}

}
