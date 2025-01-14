package tratamentos_de_excecoes.problema1.model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}

	public static class SaldoInsuficienteException extends DomainException {
		private static final long serialVersionUID = 1L;

		public SaldoInsuficienteException(String msg) {
			super(msg);
		}

	}

}
