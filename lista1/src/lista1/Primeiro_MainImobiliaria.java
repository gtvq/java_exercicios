package lista1;

import java.util.Scanner;

public class Primeiro_MainImobiliaria {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Primeiro_ImobiliariaCalculos areaDoTerreno = new Primeiro_ImobiliariaCalculos();
		
		System.out.println("Ola, digite a altura do terreno: ");
		int altura = sc.nextInt();
		System.out.println("... agora digite a largura do terreno: ");
		int largura = sc.nextInt();
		System.out.println("Um terreno com "+altura+" metros de altura e "+largura+" de largura, tem: ");
		
		areaDoTerreno.setAltura(altura);
		areaDoTerreno.setLado(largura);
		
		System.out.println(areaDoTerreno.area()+"m² de area total!");
		
	}
}
