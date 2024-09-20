package estrutura_condicional;

import java.util.Scanner;

public class Exe_05_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valorAPagar;
		
		if(codigo == 1) {
			valorAPagar = quantidade * 4.0;
		}
		else if(codigo == 2) {
			valorAPagar = quantidade * 4.50;
		}
		else if(codigo == 3) {
			valorAPagar = quantidade * 5.0;
		}
		else if(codigo == 4) {
			valorAPagar = quantidade * 2.0;
		}
		else {
			valorAPagar = quantidade * 1.50;
		}
		
		System.out.printf("Total: %.2f ", valorAPagar);

		
		sc.close();
	}

}
