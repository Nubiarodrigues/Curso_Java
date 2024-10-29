package estrutura_condicional;

import java.util.Scanner;

public class Exe_11_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String operacao = sc.nextLine();
		double A;
		double B;
		
		switch(operacao) {
		
		case "+": 
			A = sc.nextInt();
			B = sc.nextInt();
			double soma = A + B;
			System.out.println(soma);
			break;
			
		case "-": 
			A = sc.nextInt();
			B = sc.nextInt();
			double subtracao = A - B;
			System.out.println(subtracao);
			break;
			
		case "/": 
			A = sc.nextInt();
			B = sc.nextInt();
			double divisao =  A / B;
			System.out.println(divisao);
			break;
			
		case "*": 
			A = sc.nextInt();
			B = sc.nextInt();
			double mult =  A * B;
			System.out.println(mult);
			break;
			
		default: 
			System.out.println("Operação invalida");
		}
		
	
		sc.close();

	}

}
