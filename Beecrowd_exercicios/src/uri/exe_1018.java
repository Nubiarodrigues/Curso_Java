package uri;

import java.util.Scanner;

public class exe_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		System.out.println(valor);
		System.out.println(valor / 100 + " nota(s) de R$ 100,00"); //DIVISÃO...
		valor = valor % 100; //RESTO DA DIVISÃO...
		System.out.println(valor / 50 +" nota(s) de R$ 50,00");
		valor = valor % 50;
		System.out.println(valor / 20 +" nota(s) de R$ 20,00");
		valor = valor % 20;
		System.out.println(valor / 10 +" nota(s) de R$ 10,00");
		valor = valor % 10;
		System.out.println(valor / 5 +" nota(s) de R$ 5,00");
		valor = valor % 5;
		System.out.println(valor / 2 +" nota(s) de R$ 2,00");
		valor = valor % 2;
		System.out.println(valor / 1 +" nota(s) de R$ 1,00");
		valor = valor % 1;
		
		sc.close();
	}

}
