package enumeracoes_composicao.problema_exemplo_composicao;

// Em um carro terei diversas funcionalidades e peças

// motor
class Motor {
	public void ligar() {
		System.out.println("Motor ligado!");
	}
}


// pneu
class Pneu {
	public void encher() {
		System.out.println("Pneu enchido!");
	}
}


// porta
class Porta {
	public void abrir() {
		System.out.println("Porta aberta!");
	}
}


// classe carro
class Carro {
	private Motor motor;
	private Pneu pneu;
	private Porta porta;
	
	// construtor
	public Carro() {
		this.motor = new Motor(); // o carro TEM um motor
		this.pneu = new Pneu(); // o carro TEM pneus
		this.porta = new Porta(); // o carro TEM portas
	}
	
	// função ligarCarro
	public void ligarCarro() {
		motor.ligar();
		pneu.encher();
		porta.abrir();
		System.out.println("O carro está pronto para rodar!");
	}
}


public class Program {

	public static void main(String[] args) {


		// exemplo claro de composição
		// terei minha classe principal e ela fará uso de classes secundárias para sua funcionalidade

		Carro carro = new Carro();
		carro.ligarCarro();
		
	}

}
