package polimorfismo.classesMetodosAbstratos.classesAbstratas;

public class SavingsAccount extends Account {

private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// método de outra classe sendo usada com outra condição nesta subclasse através de uma sobrescrita
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
}
