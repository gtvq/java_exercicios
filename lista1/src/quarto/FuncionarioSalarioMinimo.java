package quarto;

public class FuncionarioSalarioMinimo {
	
	/*
	Faça um programa em java que receba o valor do salário mínimo e o valor do
	salário de um funcionário, calcule e mostre a quantidade de salários mínimos que
	ganha esse funcionário.
	 */
	
	public static final int SALARIOMINIMO = 1518;
	
	public FuncionarioSalarioMinimo() {
	}
	
	public float qtdSalariosMinimos(float salarioFuncionario) {
		
		return salarioFuncionario / SALARIOMINIMO;
	}
}
