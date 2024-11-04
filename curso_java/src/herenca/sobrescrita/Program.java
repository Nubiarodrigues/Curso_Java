package herenca.sobrescrita;

public class Program {

	public static void main(String[] args) {

		// USANDO O MÉTODO DA SUPER CLASSE ACCOUNT
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		// USANDO MÉTODO SOBRESCRITO COM CONDIÇÕES DIFERENTES DEFINIDAS NA CLASSE SAVINGSACCOUNT
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		// UTILIZAÇÃO DO SUPER NA CLASSE BusineeAccount E REDUZINDO 2.0 A MAIS ALÉM DO 5.0
		Account acc3 = new BusineeAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
