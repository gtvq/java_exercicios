package clinica;

public class Animal {
	
	private String nome;
	private String especie;
	private String raca;
	private int idade;
	private int id;
	
	public Animal() {
	}
	
	public Animal(String nome, String especie, String raca, int idade, int id) {
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
