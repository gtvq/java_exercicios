package primeiro;

public class TesteArray {

	/*
	Verificar se arrays em java podem ser definidos em tempo de execução. Para isso, crie
	uma classe chamada TesteArray que encapsule um array de inteiros, sem tamanho
	definido. O construtor desta classe deve receber como parâmetro o tamanho do vetor a
	ser definido. Depois, escreva uma classe DemoTesteArray que teste a declaração e
	criação de TesteArray, utilizando um valor teclado como tamanho.
	 */
	
	private int[] array;
	
	public TesteArray(int tam) {
		array = new int[tam];
	}
	
	public void imprimirTamanho() {
		System.out.println("tamanho do array: "+array.length);
	}
}
