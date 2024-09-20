package exercicios_diversos;

import java.util.Random;

public class Gerando_Numeros_Randomicos {

	public static void main(String[] args) {
		//GERANDO NÚMEROS ALEATÓRIOS DE 0 A 24
		
		Random  random = new Random();
		
		 // Definir o número de sorteios
        int quantidadeNumeros = 15;  
        int[] numerosSorteados = new int[quantidadeNumeros];
        
        for (int i = 0; i < quantidadeNumeros; i++) {

            numerosSorteados[i] = random.nextInt(25) + 1;

            System.out.print(" " +  numerosSorteados[i]);
	}
	}
}


