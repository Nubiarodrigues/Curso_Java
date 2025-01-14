package herenca.sobrescrita;

public class BusineeAccount extends Account {

	private Double loanLimit;

	public BusineeAccount() {
		super();
	}

	// ultilização do construtor da super classe que é Account
	public BusineeAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	// método que faz o emprestimo, e ela esta usando a função deposit que foi herada do Account
	// os atributos da classe super só poderá ser acessados desta forma se eles tiver definido como protected
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}

	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
