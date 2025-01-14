package poo.problema5.application;

import java.util.Locale;
import java.util.Scanner;

import poo.problema5.entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		estudante.nome = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		System.out.println();
		
		if(estudante.MediaAlunoA() >= 60) {
			System.out.println(estudante.toStringAp());
		}else {
			System.out.println(estudante.toStringRp());
		}
			
		
		sc.close();

	}

}
