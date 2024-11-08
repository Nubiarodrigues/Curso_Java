package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

	public static void main(String[] args) {
		
		String path = "D:\\temp\\in.txt"; // Caminho do arquivo de entrada
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path); // Cria uma instância de FileReader com o caminho especificado
			br = new BufferedReader(fr); // Cria um BufferedReader para ler o arquivo a partir do FileReader

			String line = br.readLine(); // Lê a primeira linha do arquivo

			while (line != null) { // Enquanto houver linhas a serem lidas
				System.out.println(line); // Imprime a linha atual no console
				line = br.readLine(); // Lê a próxima linha do arquivo
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma IOException
		} 
		finally {
			try {
				if (br != null) { // Verifica se BufferedReader foi inicializado
					br.close(); // Fecha o BufferedReader para liberar recursos
				}
				if (fr != null) { // Verifica se FileReader foi inicializado
					fr.close(); // Fecha o FileReader para liberar recursos
				}
			} 
			catch (IOException e) {
				e.printStackTrace(); // Mostra o erro exato que ocorreu ao tentar fechar os recursos
			}
		}

	}
}
