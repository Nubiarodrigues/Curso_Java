package membros_estaticos.problema2.entities;

public class Calcular {
	
	public static final double PI = 3.14159; //DECLARAÇÃO DE CONSTANTES
	
	
	public static double circumferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
