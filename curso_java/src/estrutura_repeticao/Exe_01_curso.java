package estrutura_repeticao;

import java.util.Scanner;

public class Exe_01_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for (int i = 0; i <= X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
