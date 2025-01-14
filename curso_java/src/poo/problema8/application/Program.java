package poo.problema8.application;
import java.util.Locale;
import java.util.Scanner;

import poo.problema8.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Entre com os dados do produto: ");
		
		//CRIAR VARIÁVEIS TEMPORARIAS PARA APÓS COLOCAR DENTRO DO CONSTRUTOR
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();		
		
		//INSTÂNCIA DO CONSTRUTOR COM PARÂMETROS
		Produto produto = new Produto(nome, preco);
		
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


