package sexto;

public class AnoDias {
	
	/*
	Escreva um programa em java para ler o nome e a idade de uma pessoa, e
	exibir quantos dias de vida ela possui. Considere sempre anos completos, e que
	um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
	veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
	 */
	
	public static final int DIASANOS = 365;
	
	public AnoDias() {
	}
	
	public int idadeEmDias(int idade) {
		return idade * DIASANOS;
	}
	

}
