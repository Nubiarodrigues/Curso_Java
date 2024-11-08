package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternon", "Good night"};
		
		// vai criar arquivo nesta pasta e com este nome
		String path = "D:\\temp\\out.txt";
		
		// vai percorrer a lista e colocar todos os nomes no arquivo .txt
		// o true, vai indicar que não vou querer recriar o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine(); // quebra de linha 
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
