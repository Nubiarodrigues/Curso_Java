package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// instância do SimpleDateFormat para definir um formato de data

		System.out.print("Enter departament´s name: ");
		String departamentName = sc.nextLine();

		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		String workerName = sc.nextLine();

		System.out.print("Level: ");
		String workerLevel = sc.nextLine();

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		// instância do objeto "Worker" e dentro a instância do departamento
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departamentName));

		// contratos
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		// for para ler os n contratos
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			String data1 = sc.next(); // recebendo data do usuário
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy")); // convertendo para o formato que quero																						// desejada
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			// instância do contrato (HourContract)
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);

			// associando contrato feito ao trabalhador
			worker.addContract(contract);

		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		// quebrando data e convertendo para inteiro
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // recorta e convete string gerando um subString com os 2 digitos de acordo com intervalo
		int year = Integer.parseInt(monthAndYear.substring(3)); // recorta e convete string gerando um subString com os 4 digitos
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());  // acessando departamento, e através dele acessar o nome do departamento
		System.out.printf("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();

	}

}
