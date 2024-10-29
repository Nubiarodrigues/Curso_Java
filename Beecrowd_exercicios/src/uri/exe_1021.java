package uri;

import java.util.Locale;
import java.util.Scanner;

public class exe_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valor = sc.nextDouble();
		int resultado;
				
		System.out.println("NOTA(S): ");
		resultado = (int)valor / 100;
		System.out.println(resultado + " nota(s) de R$ 100,00");
		valor = valor % 100;
		
		resultado = (int)valor / 50;
		valor = valor % 50;
		System.out.println(resultado + " nota(s) de R$ 50,00");
		
		resultado = (int)valor / 20;
		valor = valor % 20;
		System.out.println(resultado + " nota(s) de R$ 20,00");
		
		resultado = (int)valor / 10;
		valor = valor % 10;
		System.out.println(resultado + " nota(s) de R$ 10,00");
		
		resultado = (int)valor / 5;
		valor = valor % 5;
		System.out.println(resultado + " nota(s) de R$ 5,00");
		
		resultado = (int)valor / 2;
		valor = valor % 2;
		System.out.println(resultado + " nota(s) de R$ 2,00");
		
		System.out.println();
		
		System.out.println("MOEDA(S): ");
		resultado = (int)(valor / 1);
		System.out.println(resultado + " moeda(s) de R$ 1,00");
		valor = valor % 1;
		
		resultado = (int)(valor / 0.50);
		System.out.println(resultado + " moeda(s) de R$ 0,50");
		valor = valor % 0.50;
		
		resultado = (int)(valor / 0.25);
		System.out.println(resultado + " moeda(s) de R$ 0,25");
		valor = valor % 0.25;
		
		resultado = (int)(valor / 0.10);
		System.out.println(resultado + " moeda(s) de R$ 0,10");
		valor = valor % 0.10;
		
		resultado = (int)(valor / 0.05);
		System.out.println(resultado + " moeda(s) de R$ 0,05");
		valor = valor % 0.05;
		
		resultado = (int)(valor / 0.01);
		System.out.println(resultado + " moeda(s) de R$ 0,01");
		valor = valor % 0.01;
		
		sc.close();

	}

}
