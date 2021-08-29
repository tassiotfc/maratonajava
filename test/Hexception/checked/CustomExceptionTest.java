package Hexception.checked;

import Hexception.LoginInvalidoException;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			login();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	private static void login() throws LoginInvalidoException {
		String usuarioBD = "Goku";
		String senhaBD = "111";
		String usuarioDigitado = "Goku";
		String senhaDigitado = "112";
		if(!usuarioBD.equals(usuarioDigitado) || !senhaBD.equals(senhaDigitado)) {
			throw new LoginInvalidoException("Usuario ou senha invalido");
		}else {
			System.out.println("Logado");
		}
	}
}