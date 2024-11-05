package polimorfismo.classesMetodosAbstratos.problema1;

public class PersonPhysical extends Contributors {

	private Double healthExpenses;

	public PersonPhysical() {
		super();
	}

	public PersonPhysical(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {

		double income = super.getAnnualIncome();
		double tax = 0.0;

		if (income < 2000.00) {
			tax = income * 0.15;
		} else {
			tax = income * 0.25;
		}

		if (healthExpenses > 0.0) {
			tax -= healthExpenses * 0.5;
		}

		return tax;
	}

}
