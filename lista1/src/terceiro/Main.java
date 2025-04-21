package terceiro;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Hipotenusa hptn = new Hipotenusa();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, digite o valor do primeiro cateto: ");
		double catetoA = sc.nextDouble();
		System.out.println("Ola, digite o valor do segundo cateto: ");
		double catetoB = sc.nextDouble();
		
		hptn.setCatetoA(catetoA);
		hptn.setCatetoB(catetoB);
		
		System.out.println("a hipotenuca do triangulo de lados "+hptn.getCatetoA()+ " e "+hptn.getCatetoB()+" é "+hptn.retornaHipotenusa());
		
	}

}
