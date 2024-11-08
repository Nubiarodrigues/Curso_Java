package poo.problema1.application;
import java.util.Locale;
import java.util.Scanner;

import poo.problema1.entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//CLASS TRIANGULO SENDO INSTANCIADA NAS VARIÁVEIS DECLARADAS DO TIPO TRIANGULO
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		//ACESSANDO MEUS ATRIBUTOS DA CLASSE TRIANGULO QUE SERÃO A ENTRADA DO USUÁRIO
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble(); 
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//USANDO O MÉTODO DA CLASSE TRIANGULO
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do trinagulo X: %.4f%n", areaX);
		System.out.printf("Área do trinagulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		
		sc.close();


	}

}
