package herenca.upcasting_downcasting;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING -> Conversão de um objeto do tipo BusinessAccount para Account.
		// Atribuir um objeto da subclasse (BusinessAccount) para uma variável da superclasse (Account).
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING -> Conversão de um objeto do tipo Account para BusinessAccount.
		// É necessário fazer um cast explícito para especificar que estamos tratando o objeto como BusinessAccount.
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0); // Chamada de um método específico da classe BusinessAccount.

		
		// Tentar realizar o downcasting sem verificar o tipo da instância pode gerar uma ClassCastException.
		// Verificação com "instanceof" para garantir que o objeto pode ser convertido de forma segura.
		if (acc3 instanceof BusinessAccount) {
		    BusinessAccount acc5 = (BusinessAccount) acc3;
		    acc5.loan(200.0);
		    System.out.println("Loan!");
		}

		// Verificação se acc3 é uma instância de SavingsAccount antes de realizar o downcasting.
		// Isso evita exceções e permite acessar métodos específicos de SavingsAccount.
		if (acc3 instanceof SavingsAccount) {
		    SavingsAccount acc5 = (SavingsAccount) acc3;
		    acc5.updateBalance(); // Método específico da classe SavingsAccount.
		    System.out.println("Update!!");
		}

		
	}

}
