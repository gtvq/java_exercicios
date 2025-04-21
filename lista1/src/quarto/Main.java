package quarto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FuncionarioSalarioMinimo pessoa = new FuncionarioSalarioMinimo();
		
		System.out.println("Ola, digite o salario da pessoa: ");
		float salario = sc.nextFloat();
		
		System.out.println("R$"+salario+" é equivalente a "+pessoa.qtdSalariosMinimos(salario)+" salarios minimos");
	}
}
