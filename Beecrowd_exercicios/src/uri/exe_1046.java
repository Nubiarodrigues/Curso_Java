package uri;

import java.util.Scanner;

public class exe_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int termination = sc.nextInt();

		int duration;

		if (termination > start) {
			duration = termination - start; // se o término é depois do início no mesmo dia
		} else if (termination < start) {
			duration = (24 - start) + termination; // se o término é no dia seguinte
		} else {
			duration = 24; // se o início e o término são iguais, a duração é de 24 horas
		}

		System.out.println("O JOGO DUROU " + duration + " HORAS");

		sc.close();

	}

}
