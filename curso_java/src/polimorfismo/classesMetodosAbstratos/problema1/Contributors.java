package polimorfismo.classesMetodosAbstratos.problema1;

public abstract class Contributors {

	private String name;
	private Double annualIncome;

	public Contributors() {
	}

	public Contributors(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract double tax();

	@Override
	public String toString() {
		return name + ": " + " $ " 
				+ String.format("%.2f", tax());
	}
}
