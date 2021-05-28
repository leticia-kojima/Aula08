
public class Juros {

	public static void main(String[] args) {
		
		double valorInicial = 1000.0;
		double taxaInvestimento = 10.0;
		int meses = 3;
		
		double valorFinal = calcularJuros(valorInicial, taxaInvestimento, meses);
		
		System.out.println("Valor final: R$" + valorFinal);
		
		/*
		double valorLucro = calcularLucroJuros(valorInicial, taxaInvestimento, meses);
		
		System.out.println("Valor lucro: R$" + valorLucro);
		*/
		double valorLucro = calcularLucroJuros(valorFinal, valorInicial);
		
		System.out.println("Valor lucro: R$" + valorLucro);

	}
	/*
	public static double calcularLucroJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = calcularJuros(valor, taxa, quantidadeMeses);
		return resultado - valor;
		
	}
	*/
	
	public static double calcularLucroJuros(double resultado, double valor) {

		return resultado - valor;
		
	}
	
	public static double calcularJuros(double valor, double taxa, int quantidadeMeses) {
		double resultado = valor;
		
		//calculo
		
		for(int i = 0; i < quantidadeMeses; i++) {
			resultado = resultado * (1.0 + (taxa/100));
		}
		
		return resultado;
	}

}
