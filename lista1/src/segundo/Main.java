package segundo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Haras haras = new Haras();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, quantos cavalos você comprou? ");
		int cavalos = sc.nextInt();
		
		System.out.println("Você irá precisar de "+haras.retornarQtdFerraduras(cavalos)+" ferraduras!");
		
	}
}
