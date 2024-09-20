package estrutura_repeticao;

public class Exe_for_each {

	public static void main(String[] args) {
		
		//USADO PARA PERCORRER COLEÇÕES
		/*SINTAXE:
		FOR (TIPO APELIDO : COLEÇÃO){
			COMANDO 1...
		}
		*/
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		for(String nomes : vect) {
			System.out.println(nomes);
		}

	}

}
