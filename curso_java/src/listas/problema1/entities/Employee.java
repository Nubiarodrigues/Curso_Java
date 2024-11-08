package listas.problema1.entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percetange) {
		salary += salary * percetange / 100.0;
	}


	@Override
	public String toString() {
		return 
				id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	

}
