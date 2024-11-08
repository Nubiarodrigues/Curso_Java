package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastaComFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		// uma variável do tipo file por ser usado tanto para caminho de arquivo, como
		// de pasta
		File path = new File(strPath);

		// cria vetor de folders contendo cada um dos caminhos das subpastas
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS: ");

		// percorre meu vetor e mostra as subpastas da pasta
		for (File folder : folders) {
			System.out.println(folder);
		}

		// cria vetor de files contendo cada um dos caminhos dos arquivos
		File[] files = path.listFiles(File::isFile);

		System.out.println();
		System.out.println("FILES: ");

		// percorre meu vetor e mostra os arquivos da pasta
		for (File file : files) {
			System.out.println(file);
		}

		// criando subpasta a partir da pasta \temp
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("DIRECTORY CREATED SUCESSFULLY: " + sucess);

		sc.close();
	}

}
