package estrutura_condicional;

import java.util.Scanner;

public class Exe_10_curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes = sc.nextInt();
		String meses;
		
		switch(mes) {
		case 1:
			meses = "Janeiro";
			break;
		case 2:
			meses = "Fevereiro";
			break;
		case 3:
			meses = "Março";
			break;
		case 4:
			meses = "Abril";
			break;
		case 5:
			meses = "Maio";
			break;
		case 6:
			meses = "Junho";
			break;
		case 7:
			meses = "Julho";
			break;
		case 8:
			meses = "Agosto";
			break;
		case 9:
			meses = "Setembro";
			break;
		case 10:
			meses = "Outubro";
			break;
		case 11:
			meses = "Novembro";
			break;
		case 12:
			meses = "Dezembro";
			break;
		default:
			meses = "Mês invalido!";
			break;
		}
		
		System.out.println(meses);
		
		sc.close();

	}

}
