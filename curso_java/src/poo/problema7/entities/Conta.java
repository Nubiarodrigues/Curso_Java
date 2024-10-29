package poo.problema7.entities;

public class Conta {
	
	private String titular;
	private int conta;
	private double saldo;
	
	
	public Conta(String titular, int conta) {
		this.titular = titular;
		this.conta = conta;
	}
	

	public String getTitular() {
		return titular;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor + 5.0);
	}
	
	public String toString() {
		return
				"Conta " + conta + ", " 
				+ "Titular: " + titular 
				+ ", " + "Saldo: $ " + String.format("%.2f", saldo);
	}
		

}
