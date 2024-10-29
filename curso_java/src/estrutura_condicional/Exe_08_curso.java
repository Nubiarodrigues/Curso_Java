package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Exe_08_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario > 2000.00 && salario <= 3000.00) {
                imposto += (salario - 2000.00) * 0.08;
            } 
            
            else if (salario > 3000.00 && salario <= 4500.00) {
                imposto += (1000.00) * 0.08; // 8% sobre a faixa de 2000.01 a 3000.00
                imposto += (salario - 3000.00) * 0.18; // 18% sobre o valor que excede 3000.00
            } 
            
            else if (salario > 4500.00) {
                imposto += (1000.00) * 0.08; // 8% sobre a faixa de 2000.01 a 3000.00
                imposto += (1500.00) * 0.18; // 18% sobre a faixa de 3000.01 a 4500.00
                imposto += (salario - 4500.00) * 0.28; // 28% sobre o valor que excede 4500.00
            }
            
            System.out.printf("R$ %.2f%n", imposto);
        }
        
		sc.close();

	}

}
