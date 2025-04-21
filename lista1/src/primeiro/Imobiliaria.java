package primeiro;

public class Imobiliaria {

	/*
	 Uma imobiliária vende apenas terrenos retangulares. Faça um programa em
	java para ler as dimensões de um terreno e depois exibir a área do terreno. (lado x
	altura)
	 */
	
	private static int altura;
	private static int lado;
	
	public Imobiliaria() {
	}
	
	public Imobiliaria(int altura, int lado) {
	}

	public static int getAltura() {
		return altura;
	}

	public static void setAltura(int altura) {
		Imobiliaria.altura = altura;
	}

	public static int getLado() {
		return lado;
	}

	public static void setLado(int lado) {
		Imobiliaria.lado = lado;
	}
	
	
	public int area() {
		return this.altura*this.lado;
	}

}
