package poo.problema6.application;

import java.util.Locale;
import java.util.Scanner;

import poo.problema6.entities.ConversorMoedas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dólar? ");
		ConversorMoedas.ValorDollar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		ConversorMoedas.QuantDollar = sc.nextDouble();
		
		System.out.println(ConversorMoedas.representacao());
		
		sc.close();

	}

}
