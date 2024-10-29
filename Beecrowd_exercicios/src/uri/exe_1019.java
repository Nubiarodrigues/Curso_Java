package uri;

import java.util.Scanner;

public class exe_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalSegundos = sc.nextInt();
		
		//CALCULA A QUANTIDADE DE HORAS
		int horas = totalSegundos / 3600; //1 HORA TEM 3600S
		totalSegundos = totalSegundos % 3600; //ATUALIZA O totalSegundos COM O RESTO DA DIVISÃO
		
		
		//CALCULA A QUANTIDADE DE MINUTOS 
		int minutos = totalSegundos / 60; //1 MIN TEM 60S
		totalSegundos = totalSegundos % 60; //ATUALIZA O totalSegundos COM O RESTO DA DIVISÃO
		
		
		//O QUE SOBRAR SÃO OS SEGUNDOS RESTANTES
		int segundos = totalSegundos;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

		
		sc.close();
	}

}
