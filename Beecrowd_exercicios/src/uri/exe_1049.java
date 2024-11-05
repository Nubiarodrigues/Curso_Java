package uri;

import java.util.Scanner;

public class exe_1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lê as três palavras
		String tipo = sc.nextLine(); 
		String classe = sc.nextLine();
		String dieta = sc.nextLine(); 

		// Identifica o animal baseado nas entradas
		if (tipo.equals("vertebrado")) {

			if (classe.equals("mamifero")) {
				if (dieta.equals("onivoro")) {
					System.out.println("homem");

				} else if (dieta.equals("herbivoro")) {
					System.out.println("vaca");

				} else if (classe.equals("ave")) {
					if (dieta.equals("carnivoro")) {
						System.out.println("água");
					} else if (dieta.equals("onivoro")) {
						System.out.println("pombo");

					}

				} else if (tipo.equals("invertebrado")) {

					if (classe.equals("anelideo")) {
						if (dieta.equals("onivoro")) {
							System.out.println("minhoca");
						} else if (dieta.equals("herbivoro")) {
							System.out.println("sanguessuga");
						}

					} else if (classe.equals("inseto")) {
						if (dieta.equals("hematofago")) {
							System.out.println("pulga");
						} else if (dieta.equals("herbivoro")) {
							System.out.println("lagarta");
						}
					}
				}

				sc.close();

			}
		}

	}

}