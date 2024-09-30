package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// associações
	private Department department;

	// o funcionário tem vários contratos, por isso o uso de lista
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// adicionar contrato
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	// remover contrato
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;

		for (HourContract c : contracts) {

			int c_year = c.getDate().getYear(); // buscando ano através da chamando do LocalDate da class HourContract
			int c_month = c.getDate().getMonthValue(); // buscando mês através da chamando do LocalDate da class
														// HourContract

			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
