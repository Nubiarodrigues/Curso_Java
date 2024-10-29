package poo.problema3.application;
import java.util.Locale;
import java.util.Scanner;

import poo.problema3.entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		double altura = sc.nextDouble();
		double largura = sc.nextDouble();
		
		retangulo.altura = altura;
		retangulo.largura = largura;
		
		System.out.println(retangulo);
		
		
		sc.close();

	}

}
