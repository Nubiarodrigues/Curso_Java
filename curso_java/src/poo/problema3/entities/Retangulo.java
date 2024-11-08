package poo.problema3.entities;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double Area() {
		return this.altura * this.largura;	
	}
	
	public double Perimetro() {
		return 2 * (this.altura + this.largura);	
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
	}
	
	public String toString() {
		return
				"AREA = " + String.format("%.2f\n", Area())
				+ "PERIMETRO = " + String.format("%.2f\n", Perimetro())
				+ "DIAGONAL = " + String.format("%.2f\n", Diagonal());	
	}
	
	
}
