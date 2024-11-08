package polimorfismo.problema2.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.problema2.entities.ImportedProduct;
import polimorfismo.problema2.entities.Product;
import polimorfismo.problema2.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> listProducts = new ArrayList<>();

		System.out.print("Enter the number od products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported? (c/u/i)? ");
			char response = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (response == 'c') {
				listProducts.add(new Product(name, price));
			}

			else if (response == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String dateStr = sc.nextLine();
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate manufactureDate = LocalDate.parse(dateStr, fmt);

				listProducts.add(new UsedProduct(name, price, manufactureDate));

			}

			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				listProducts.add(new ImportedProduct(name, price, customsFee));
			}

		}

		System.out.println();
		System.out.println("PAYMENT: ");

		for (Product product : listProducts) {
			System.out.println(product.priceTag());
		}

		sc.close();
	}
}
