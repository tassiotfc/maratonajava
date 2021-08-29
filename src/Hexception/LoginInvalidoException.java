package Hexception;

//Regra Obrigatoria: NUNCA TRATA EXCECOES EM CLASSES DE EXCECOES
public class LoginInvalidoException extends Exception {

	public LoginInvalidoException(String message) {
		super(message);
	}
}
