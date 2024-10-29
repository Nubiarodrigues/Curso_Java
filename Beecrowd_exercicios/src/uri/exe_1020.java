package uri;

import java.util.Scanner;

public class exe_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadePessoa = sc.nextInt();
		
		System.out.println(idadePessoa / 365 + " ano(s)");
		idadePessoa = idadePessoa % 365;
		
		System.out.println(idadePessoa / 30 +  " mês(es)");
		idadePessoa = idadePessoa % 30;
		
		System.out.println(idadePessoa + " dia(s)");

		
		sc.close();
	}

}
