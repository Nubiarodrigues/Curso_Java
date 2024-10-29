package estrutura_condicional;

import java.util.Scanner;

public class Exe_03_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");	
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();

	}

}
