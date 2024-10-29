package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo_1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		//ADICIONANDO
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//ADICIONANDO DE ACORDO COM A POSIÇÃO
		list.add(2, "Marcos");
		
		//TAMANHO DA LISTA
		System.out.println(list.size());

		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("-----------------");
		
		//REMOVER INDICANDO UMA CONDIÇÃO
		list.removeIf(nomes -> nomes.charAt(0) == 'M');
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("-----------------");
		System.out.println("Index od bob: " + list.indexOf("Bob"));
		System.out.println("Index od Marcos: " + list.indexOf("Marcos"));
		
		System.out.println("-----------------");
		List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'A').collect(Collectors.toList());
		for(String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("-----------------");
		//ENCONTRA O 1º ELEMENTO QUE COMECE COM A LETRA A
		String name = list.stream().filter(nomes -> nomes.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
}
}
