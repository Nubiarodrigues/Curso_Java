package arquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// acessar somente nome do arquivo
		System.out.println("getName: " + path.getName());
		
		// acessar só o caminho
		System.out.println("getParent: " + path.getParent());
		
		// acessar todo caminho 
		System.out.println("getPath: " + path.getPath());
		
		
		sc.close();

	}

}
