package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> listNumbers = new ArrayList<>();

		System.out.print("Quantos números você deseja colocar na lista? ");
		int n = sc.nextInt();
		sc.nextLine();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o número #" + (i + 1) + ":");
			int number = sc.nextInt();
			listNumbers.add(number);

		}

		for (int numbers : listNumbers) {
			sum += numbers;
		}

		System.out.println();
		System.out.println("Soma de todos os números da lista: " + sum);

		sc.close();
	}

}