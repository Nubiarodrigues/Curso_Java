package polimorfismo.classesMetodosAbstratos.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		List<Shape> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char response = sc.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (response == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));
			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");

		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}

		sc.close();
	}

}
