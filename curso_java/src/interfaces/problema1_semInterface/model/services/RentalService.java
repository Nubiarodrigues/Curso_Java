package interfaces.problema1_semInterface.model.services;

import java.time.Duration;

import interfaces.problema1_semInterface.model.entities.CarRental;
import interfaces.problema1_semInterface.model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	// função que vai processar a fatura
	public void processInvoice(CarRental carRental) {
		// diferença em minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFisish()).toMinutes();
		// conversão para horas
		double hours = minutes / 60.0;

		double basicPayment;

		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
