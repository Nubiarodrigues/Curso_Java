package poo.problema6.entities;

public class ConversorMoedas {
	
	public static double ValorDollar;
	public static double QuantDollar;
	public static double iof = 0.06;
	
	public static double Conversor() {
		double resultado = ValorDollar * QuantDollar;
		iof *= resultado;
		return resultado + iof;
		
	}
	
	public static String representacao() {
		return 
			"Valor a ser pago em reais = " + String.format("%.2f", Conversor());	
	}
	

}
