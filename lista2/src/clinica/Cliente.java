package clinica;

public class Cliente {
	
	private String nome;
	private int id;
	private String email;
	private String numero;
	private Animal animal;
	
	public Cliente() {
	}
	
	public Cliente(String nome, int id, String email, String numero, Animal animal) {
		this.email = email;
		this.numero = numero;
		this.nome = nome;
		this.id = id;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	

}
