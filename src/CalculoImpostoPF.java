
public class CalculoImpostoPF {

	public static void main(String[] args) {
		
		String nome = "Fl�vio Moreni";
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
		System.out.println("**	   FUNCION�RIO: " + nome);
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   IMPOSTO DE RENDA");
		System.out.println("**");
		System.out.println("**	 SAL�RIO BRUTO: "+ salarioBruto);
		System.out.println("**	IMPOSTO RETIDO: " + irRetido + " BRL");
		System.out.println("**	   SAL�RIO L�Q: " + salarioLiquidoSemIr + " BRL");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   PREVID�NCIA");
		System.out.println("**");
		System.out.println("**	 	  ALIQUOTA: " + aliquota + " %");
		System.out.println("**	IMPOSTO RETIDO: " + inssRetido + " BRL");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("**");
		System.out.println("**   SAL�RIO LIQUIDO: " + salarioLiquidoTotal + " BRL");
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
		System.out.println("**	SAL�RIO BRUTO: 8.000,00 BRL");
		System.out.println("**");
		System.out.println("**");
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
	}

}
