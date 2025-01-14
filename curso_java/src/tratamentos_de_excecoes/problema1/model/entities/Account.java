package tratamentos_de_excecoes.problema1.model.entities;

import tratamentos_de_excecoes.problema1.model.exceptions.DomainException;

public class Account {

	private Integer number; // número da conta
	private String holder; // titular
	private Double balance; // saldo
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	// função para depositar
	public void deposit(double amount) {
		balance += amount;
	}

	// função para retirar
	public void withdraw(double amount) throws DomainException {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (balance < withdrawLimit) {
			throw new DomainException.SaldoInsuficienteException("Not enough balance");
		}

		balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: R$ " + String.format("%.2f", balance);
	}

}
