package problema7_poo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorDeposito;	
		double saque;
		
		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o titular: ");
		String titular = sc.nextLine();
		sc.nextLine();
		
		//CONSTRUTOR DE 2 PARÂMETROS
		Conta conta = new Conta(titular, numeroConta);
		
		System.out.print("Deseja iniciar um depósito (y/n)?  ");
		char response = sc.next().charAt(0);

		
		if(response == 'y') {
			System.out.print("Entre com o valor inicial: ");
			valorDeposito = sc.nextDouble();
			sc.nextLine();
			conta.deposito(valorDeposito);
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(conta);
		}else {
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(conta);
		}
		
		System.out.println("__________________________________________________________________________");

		System.out.print("Entre com o valor de depósito: ");
		valorDeposito = sc.nextDouble();	
		conta.deposito(valorDeposito);
		sc.nextLine();
		System.out.println();
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println("__________________________________________________________________________");
		
		System.out.print("Entre com valor de saque: ");
		saque = sc.nextDouble();
		conta.saque(saque);
		sc.nextLine();
		System.out.println();
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println("__________________________________________________________________________");
		
		sc.close();

	}

}
