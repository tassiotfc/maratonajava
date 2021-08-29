package BModificadorestatico;

import org.junit.jupiter.api.Test;

import Bmodificadorestatico.Cliente;

public class ClienteTest {

	@Test
	public void test() {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        System.out.println("tamanho: "+ Cliente.getParcelas().length);
	}
}
