package terceiro;

public class Hipotenusa {

	/*
	 Faça um programa em java que receba o valor dos catetos a e b de um
	triângulo, calcule e mostre o valor da hipotenusa. 
	 */
	
	private double catetoA;
	private double catetoB;
	
	public Hipotenusa() {
	}
	public Hipotenusa(int catetoA, int catetoB) {
	}

	public double getCatetoA() {
		return catetoA;
	}
	public void setCatetoA(double catetoA) {
		this.catetoA = catetoA;
	}
	public double getCatetoB() {
		return catetoB;
	}
	public void setCatetoB(double catetoB) {
		this.catetoB = catetoB;
	}
	
	public double retornaHipotenusa() {
		return Math.sqrt(Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2));
	}
	
}
