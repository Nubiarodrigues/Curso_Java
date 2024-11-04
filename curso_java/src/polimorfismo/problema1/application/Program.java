package polimorfismo.problema1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.problema1.entities.Employee;
import polimorfismo.problema1.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// listas p/armazer funcionários
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");

			System.out.print("Outsourced (y/n)?  ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (response == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				// chamanda do objeto dentro da lista que precisa do adicional
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}

			else {
				// chamanda do objeto padrão dentro da lista
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENT: ");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		
			sc.close();
		}
	}

