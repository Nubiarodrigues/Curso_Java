package poo.problema2.entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
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
