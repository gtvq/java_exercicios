package segundo;

public class Haras {
	/*
	 Faça um programa em java para calcular quantas ferraduras são necessárias
	para equipar todos os cavalos comprados para um haras. A informação de cavalos
	comprados deve ser informada pelo usuário.
	 */
	
	public static int FERRADURAS = 4;
	
	public Haras() {
	}
	
	public int retornarQtdFerraduras(int qtdCavalos) {
		return qtdCavalos*FERRADURAS;
	}
}
