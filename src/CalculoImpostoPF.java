
public class CalculoImpostoPF {

	public static void main(String[] args) {
		
		String nome = "Flávio Moreni";
		double salarioBruto = 20000;
		double irRetido = 1;
		double salarioLiquidoSemIr = 19999; 
		double aliquota = 15; 
		double inssRetido = 1;
		double salarioLiquidoTotal = 19998;
				
		
		//imprimirTelaInicial();
		
		imprimirResultado(nome, salarioBruto, irRetido, salarioLiquidoSemIr, aliquota, inssRetido, salarioLiquidoTotal);
		
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
