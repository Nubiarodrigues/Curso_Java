package poo.problema8.entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	//CONSTRUTOR PADRÃO
	public Produto() {}
	
	//SOBRECARGA DE CONSTRUTOR (PREÇO E NOME)
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//CONSTRUTOR
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public double TotalEstoque() {
		double estoque = quantidade * preco;
		return estoque;
	}
	
	public void AdicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void RemoverEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return 
				nome + ", "
				+ "$ " + String.format("%.2f", preco) + ", "
				+ quantidade + " unidades, "
				+ "Total: $ " + String.format("%.2f", TotalEstoque());
	}
}
