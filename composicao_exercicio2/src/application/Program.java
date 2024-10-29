package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Library registration: ");
		System.out.print("Name: ");
		String nameLibrary = sc.nextLine();
		System.out.print("Address: ");
		String address = sc.nextLine();
		
		
		
		System.out.print("How many books do you want to register? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Book #" + i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
