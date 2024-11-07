package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) {

		// Caminho para o arquivo é definido diretamente na instância do objeto File
		// O objeto File encapsula o processo de acesso ao arquivo e armazena o caminho
		// dele
		File file = new File("D:\\temp\\in.txt");
		Scanner sc = null;

		// Após instanciar o Scanner com o File, uma IOException pode ocorrer caso haja
		// um problema
		// ao tentar abrir o arquivo, por isso é necessário um tratamento de exceções
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // Verifica se ainda existe uma nova linha no arquivo
				System.out.println(sc.nextLine()); // Exibe o conteúdo da linha atual
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma IOException
		} 
		finally {
			if (sc != null) { // Verifica se o Scanner foi inicializado
				sc.close(); // Fecha o Scanner para liberar recursos
			}
		}

	}

}
