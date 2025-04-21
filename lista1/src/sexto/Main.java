package sexto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, qual seu nome? ");
		String nome = sc.nextLine();
		System.out.println(nome+", qual a sua idade? ");
		int idade = sc.nextInt();
		
		AnoDias anoDias = new AnoDias();
		System.out.println(nome+", você viveu "+anoDias.idadeEmDias(idade)+ " dias");
	}

}
