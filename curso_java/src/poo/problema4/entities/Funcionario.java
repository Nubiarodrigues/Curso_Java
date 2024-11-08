package poo.problema4.entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double SalarioLiquido() {
		return this.salarioBruto - taxa;
	}
	
	public void AumentoSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * (porcentagem / 100);
	}
	
	public String toString() {
		return
				nome + ", "
				+ "$ " + String.format("%.2f", SalarioLiquido());
	}
	

}
