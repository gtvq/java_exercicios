package primeiro;

import java.util.Scanner;

public class DemoTesteArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, digite o tamanho do array: ");
		int tam = sc.nextInt();
		
		TesteArray arrayUm = new TesteArray(tam);
		
		arrayUm.imprimirTamanho();
		
		sc.close();
	}

}
