package poo.problema5.entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double MediaAlunoA() {
		double media = this.nota1 + this.nota2 + this.nota3;
		return media;		
	}
	
	public double PontosFaltosos() {
		double media = 60.0 - (this.nota1 + this.nota2 + this.nota3);
		return media;
	}
	
	public String toStringAp() {
		return 
				"NOTA FINAL = " + String.format("%.2f\n", MediaAlunoA())
				+ "APROVADO";
	}
	
	public String toStringRp() {
		return 
				"NOTA FINAL = " + String.format("%.2f\n", MediaAlunoA())
				+ "REPROVADO " + String.format("\n")
				+ "PONTOS AUSENTES " + String.format("%.2f", PontosFaltosos());
				
	}
	
	
	
	

}
