package clinica;

public class Consulta {
	/*
	Cenário
	Você foi contratado para desenvolver um sistema simples para o controle de
	animais de estimação em uma clínica veterinária. A clínica deseja informatizar
	o cadastro de seus clientes e os animais de estimação que são atendidos. A
	seguir, é apresentada a descrição do funcionamento da clínica:
	1. Clientes da clínica são as pessoas que possuem animais de estimação e
	que levam seus pets para consultas. Cada cliente tem um nome, um
	número de identificação único (ID), um endereço de e-mail e um telefone
	de contato.
	2. Cada animal de estimação pertence a um cliente. Os animais de
	estimação têm um nome, uma espécie (como cão, gato, etc.), uma raça,
	uma idade, e um número de identificação único (ID).
	3. A clínica mantém um registro das consultas realizadas. Cada consulta
	está associada a um único animal de estimação e ocorre em uma data
	específica. Durante a consulta, o veterinário pode registrar observações
	sobre o estado de saúde do animal e indicar um tratamento ou
	recomendação.
	Tarefas
	1. Identificação de Classes e Atributos:
	• Leia atentamente o cenário descrito e identifique as classes
	principais que compõem o sistema.
	• Para cada classe identificada, liste seus atributos com base nas
	informações fornecidas no cenário.
	2. Identificação de Métodos:
	• Identifique os métodos que cada classe deve ter para que o
	sistema funcione conforme o descrito. Por exemplo, métodos para
	cadastrar clientes, registrar animais de estimação, agendar
	consultas, etc.
	3. Diagrama de Classes (UML):
	• Desenhe o diagrama de classes utilizando a notação UML.
	Certifique-se de incluir todas as classes, atributos, métodos e as
	relações entre as classes (todos os relacionamentos serão do tipo
	"um para um").
	4. Implementação:
	• Implemente as classes e métodos no ambiente de programação
	Java.
	• Utilize boas práticas de programação, como encapsulamento e
	clareza no código.
	• Teste seu código para garantir que o sistema de controle de
	animais de estimação funcione conforme o esperado.

	 */
	
	private String data;
	private String observacao;
	private String tratamento;
	private String recomendacao;
	private Veterinario veterinario;
	private Animal animal;
	
	public Consulta() {
	}
	
	public Consulta(String data, String observacao, String tratamento, String recomendacao, Veterinario veterinario, Animal animal) {
		this.data = data;
		this.observacao = observacao;
		this.tratamento = tratamento;
		this.recomendacao = recomendacao;
		this.veterinario = veterinario;
		this.animal = animal;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	
}
