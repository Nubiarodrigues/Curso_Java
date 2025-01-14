package poo.problema4.application;
import java.util.Locale;
import java.util.Scanner;

import poo.problema4.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário(a): " + funcionario);
		System.out.println();
		
		System.out.println("Qual porcentagem para aumentar o salário? ");
		double porcetagem = sc.nextDouble();
		funcionario.AumentoSalario(porcetagem);
		System.out.println();
		
		System.out.println("Dados atualizados: " + funcionario);
			
		sc.close();

	}

}
