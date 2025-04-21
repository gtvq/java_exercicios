package quinto;

public class Losango {

	/*
	 Faça um programa em java que calcule e 
	 mostre a área de um losango. Sabese que: 
	 A = (diagonal_maior * diagonal_menor)/2;
	 */
	
	private int diagonal_maior;
	private int diagonal_menor;
	
	public Losango() {
	}
	
	public Losango(int diagonal_maior, int diagonal_menor) {
		this.diagonal_maior = diagonal_maior;
		this.diagonal_menor = diagonal_menor;
	}

	public int getDiagonal_maior() {
		return diagonal_maior;
	}

	public void setDiagonal_maior(int diagonal_maior) {
		this.diagonal_maior = diagonal_maior;
	}

	public int getDiagonal_menor() {
		return diagonal_menor;
	}

	public void setDiagonal_menor(int diagonal_menor) {
		this.diagonal_menor = diagonal_menor;
	}
	
	public float area() {
		return (this.diagonal_maior * this.diagonal_menor)/2;
	}

}
