package arquivos.problema1.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import arquivos.problema1.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();

		File arquivoOrigem = new File(caminho);
		String pastaOrigem = arquivoOrigem.getParent();

		boolean sucess = new File(pastaOrigem + "\\out").mkdir();

		String arquivoDestino = pastaOrigem + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine(); // leitura inicial

			linha = br.readLine();

			while (linha != null) {

				// o split vai recortar a string, usando o separador especificado e vai guardar
				// em um vetor
				// ex: (Notebook Gamer), (2100.90), (10)
				String[] vetor = linha.split(",");

				// adicionando o conteúdo que foi recortado e guardado no vetor as variáveis que
				// serão meu objeto
				String nome = vetor[0];
				double preco = Double.parseDouble(vetor[1]);
				int quantidade = Integer.parseInt(vetor[2]);

				// instância do objeto
				Product product = new Product(nome, preco, quantidade);

				// adicionando na lista
				list.add(product);

				linha = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println(arquivoDestino + " CREATED");

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
