package vetores.problema2.entities;

public class Aluno {
	
	private String name;
	private int registration;
	
	public Aluno() {}

	public Aluno(String name, int registration) {
		this.name = name;
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return  
				"Nome: " + name + ", " +
				"Matrícula: "+ registration;
	}
	
	
	
	

}
