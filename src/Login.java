
public class Login {

	public static void main(String[] args) {
		/*
		 modificadorAcesso palavraChave tipoRetorno nomeFuncao(parametros){
			processo
			retorno
		}
		 */
		
		String emailDigitado = "admin@fiap.com.br";
		String senhaDigitada = "123456";
		String tokenDigitado = "leticia";
		
		boolean loginOk = validarLogin(emailDigitado, tokenDigitado, senhaDigitada);
		
		System.out.println(loginOk);
		
		
		}
	
	public static boolean validarLogin(String email, String token, String senha) {
		
		boolean retorno = false;
		
		if (email.equals("admin@fiap.com.br") && senha.equals("123456") && token.equals("leticia")) {
			retorno = true;
		}
		
		return retorno;

	}
}

