package Hexception.checked;

import java.io.FileNotFoundException;
import java.io.IOException;

import Hexception.Funcionario;
import Hexception.LoginInvalidoException;

public class OverrideWithExceptionTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		try {
			funcionario.save();
		} catch (LoginInvalidoException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		funcionario.update();
		try {
			funcionario.delete();
		} catch (FileNotFoundException | LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
