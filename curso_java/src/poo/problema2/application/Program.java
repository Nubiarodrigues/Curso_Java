package poo.problema2.application;
import java.util.Locale;
import java.util.Scanner;

import poo.problema2.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto: ");
		
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
	
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		
		System.out.print("Entre com o número de produtos para ser adicionado ao estoque: ");
		int quantidade = sc.nextInt();
		produto.AdicionarEstoque(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a ser removidos: ");
		quantidade = sc.nextInt();
		produto.RemoverEstoque(quantidade);
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
