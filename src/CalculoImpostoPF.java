
public class CalculoImpostoPF {

	public static void main(String[] args) {
		
		String nome = "Flávio Moreni";
		double salarioBruto = 20000;
		double irRetido = calcularIrRetido(salarioBruto) ;
		double salarioLiquidoSemIr = calcularSalarioSemIr(salarioBruto); 
		
		
		double aliquota = calcularAliquota(salarioBruto);
		double inssRetido = calcularINSS(salarioBruto, aliquota);
		double salarioLiquidoTotal = calcularSalarioLiquido(irRetido,inssRetido,salarioBruto);
				
		
		//imprimirTelaInicial();
		
		imprimirResultado(nome, salarioBruto, irRetido, salarioLiquidoSemIr, aliquota, inssRetido, salarioLiquidoTotal);
		
	}
	
	public static double calcularSalarioLiquido(double irRetido, double inssRetido, double salarioBruto){
		return salarioBruto - (irRetido + inssRetido);
	}
	
	public static double calcularINSS(double salario, double aliquota) {
		
		return salario * (aliquota/100);
		

	}
	
	public static double calcularAliquota(double salario) {
		
		if(salario <= 10000) {
			return 10;
		}else {
			return 20;
		}
			
	}
	
	public static double calcularSalarioSemIr( double salario ) {
		return salario - calcularIrRetido(salario);
	}
	
	public static double calcularIrRetido(double salario) {
		double valorRetido = 0;
		
		double[] aliquotas = {0,7.5,15,22.5,27.5};
		//double[] pisoFaixa = {0, 1903.99, 2826.66,  3751.06,  4664.68};
		double[] tetoFaixa = {0, 1903.98, 2826.65,  3751.05,  4664.67};
		//double[] tetoDescontoFaixa = {0, 69.20, 138.66, 205.56};
		double[] tetoDescontoFaixaTotalizado = {0, 0, 69.20, 207.86, 413.42};
		
		//Salario > 4664.67
		
		if ( salario >= tetoFaixa[4] ) {
			double resto = salario - tetoFaixa[4];
			double descontoResto = resto * ( aliquotas[4] / 100);
			valorRetido = tetoDescontoFaixaTotalizado[4] + descontoResto;
		} else if ( salario < tetoFaixa[4] && salario >= tetoFaixa[3] ) {
			double resto = salario - tetoFaixa[3];
			double descontoResto = resto * ( aliquotas[3] / 100);
			valorRetido = tetoDescontoFaixaTotalizado[3] + descontoResto;
		} else if ( salario < tetoFaixa[3] && salario >= tetoFaixa[2] ) {
			double resto = salario - tetoFaixa[2];
			double descontoResto = resto * ( aliquotas[2] / 100);
			valorRetido = tetoDescontoFaixaTotalizado[2] + descontoResto;
		} else if ( salario < tetoFaixa[2] && salario >= tetoFaixa[1] ) {
			double resto = salario - tetoFaixa[1];
			double descontoResto = resto * ( aliquotas[1] / 100);
			valorRetido = tetoDescontoFaixaTotalizado[1] + descontoResto;
		} else {
			// não é preciso pagar IR
			valorRetido = 0;
		}
		
		return valorRetido;
		
	}

	public static void imprimirResultado(
			String nome, 
			double salarioBruto, 
			double irRetido, 
			double salarioLiquidoSemIr, 
			double aliquota, 
			double inssRetido, 
			double salarioLiquidoTotal) {
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**     	RESULTADO");
		System.out.println("**");
		System.out.println("**	   FUNCIONÁRIO: " + nome);
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   IMPOSTO DE RENDA");
		System.out.println("**");
		System.out.println("**	 SALÁRIO BRUTO: "+ salarioBruto);
		System.out.println("**	IMPOSTO RETIDO: " + irRetido + " BRL");
		System.out.println("**	   SALÁRIO LÍQ: " + salarioLiquidoSemIr + " BRL");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   PREVIDÊNCIA");
		System.out.println("**");
		System.out.println("**	 	  ALIQUOTA: " + aliquota + " %");
		System.out.println("**	IMPOSTO RETIDO: " + inssRetido + " BRL");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   SALÁRIO LIQUIDO: " + salarioLiquidoTotal + " BRL");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
	}

	public static void imprimirTelaInicial() {
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**     	DADOS DO EMPREGADO");
		System.out.println("**");
		System.out.println("**");
		System.out.println("**	         NOME: Antonio Coutinho");
		System.out.println("**	        IDADE: 30 anos");
		System.out.println("**	TEMPO EMPRESA: 4 anos");
		System.out.println("**	SALÁRIO BRUTO: 8.000,00 BRL");
		System.out.println("**");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
	}

}
