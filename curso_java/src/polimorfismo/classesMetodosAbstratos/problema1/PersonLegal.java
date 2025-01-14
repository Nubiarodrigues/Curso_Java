package polimorfismo.classesMetodosAbstratos.problema1;

public class PersonLegal extends Contributors {

	private Integer numberEmployees;

	public PersonLegal() {
	}

	public PersonLegal(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		double income = super.getAnnualIncome();

		if (numberEmployees > 10.0) {
			tax = income * (14.0 / 100);
		} else {
			tax = income * (16.0 / 100);
		}

		return tax;

	}

}
