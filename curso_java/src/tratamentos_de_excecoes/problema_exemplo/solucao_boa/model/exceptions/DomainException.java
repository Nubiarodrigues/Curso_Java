package tratamentos_de_excecoes.problema_exemplo.solucao_boa.model.exceptions;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L; // declaração de versão de classe 
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
