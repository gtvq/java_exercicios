package quinto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, digite a diagonal maior do losango: ");
		int diagonal_maior = sc.nextInt();
		
		System.out.println("Ola, digite a diagonal menor do losango: ");
		int diagonal_menor = sc.nextInt();
		
		Losango losango = new Losango(diagonal_maior, diagonal_menor);
		
		System.out.println("A area do losango é de: "+losango.area());
		
	}

}
