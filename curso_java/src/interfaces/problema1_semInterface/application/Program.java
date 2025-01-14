package interfaces.problema1_semInterface.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.problema1_semInterface.model.entities.CarRental;
import interfaces.problema1_semInterface.model.entities.Vehicle;
import interfaces.problema1_semInterface.model.services.BrazilTaxService;
import interfaces.problema1_semInterface.model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel");

		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();

		System.out.print("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();

		RentalService rentalService = new RentalService(precoDia, precoHora, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println();
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: R$ " + cr.getInvoice().getTotalPayment());

		sc.close();

	}

}
