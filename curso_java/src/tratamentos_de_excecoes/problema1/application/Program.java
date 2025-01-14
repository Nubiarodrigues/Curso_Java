package tratamentos_de_excecoes.problema1.application;

import java.util.Locale;
import java.util.Scanner;

import tratamentos_de_excecoes.problema1.model.entities.Account;
import tratamentos_de_excecoes.problema1.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");

			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw R$: ");
			double amount = sc.nextDouble();

			account.withdraw(amount);

			System.out.println();
			System.out.println(account);
			
		} 
		catch (DomainException.SaldoInsuficienteException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();

	}

}
