package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Exe_07_curso {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		if(X == 0 && Y == 0) {
			System.out.println("ORIGEM");
		}else if (Y == 0) {
			System.out.println("Eixo Y");
		}else if (X == 0) {
			System.out.println("Eixo X");
		}else if (X > 0 && Y > 0) {
	        System.out.println("Q1");
	    }else if (X < 0 && Y > 0) {
	        System.out.println("Q2");
	    }else if (X < 0 && Y < 0) {
	        System.out.println("Q3");
	    }else if (X > 0 && Y < 0) {
	      System.out.println("Q4");
	    }
		
		sc.close();

		//SE X É 0 E Y NÃO É 0, ENTÃO O PONTO ESTA NO EIXO Y
		//SE Y É 0 E X NÃO É 0, ENTÃO O PONTO ESTA NO EIXO X
		
	}

}
