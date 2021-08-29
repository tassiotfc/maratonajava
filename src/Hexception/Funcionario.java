package Hexception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {
	@Override
	public void save() throws LoginInvalidoException, IOException {
		// pode lancar as mesmas exceptions da classe pai
	}

	public void update() {
		// pode nao lancar nenhuma exception (caso o programador ao reescrever o codigo
		// julgue nao necessario lancar)
	}

	public void delete() throws LoginInvalidoException, FileNotFoundException {
		// pode lancar exceptions diferentes daquela da classe pai, desde que sejam
		// filhas das exceptions lancadas no metodo pai. Isso se da devido ao
		// polimorfismo
	}
}
