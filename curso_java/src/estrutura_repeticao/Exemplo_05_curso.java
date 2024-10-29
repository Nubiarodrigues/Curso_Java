package estrutura_repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo_05_curso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList<>();
		
		
        int numeros = sc.nextInt();
        int contador = 0;

        while (numeros % 2 == 0) {
            listaNumeros.add(numeros);
            contador++;
            numeros = sc.nextInt();
        }
		
		System.out.println("Números pares digitados: " + listaNumeros);
		System.out.println("Quantidade de números pares: " + contador);
		
		sc.close();
	
	}

}
