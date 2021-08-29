package Ablocodeinicializacao;

import org.junit.jupiter.api.Test;

import Ablocodeinicializacao.Cliente;

public class ClienteTest {

	@Test
	public void test1() {
		Cliente c1 = new Cliente();
		System.out.println("Exibindo quantidade de parcelas possiveis");
		for (int parcela : c1.getParcelas()) {
			System.out.print(parcela + " ");
		}
		System.out.println();
	}

	@Test
	public void test2() {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		System.out.println("tamanho: " + c1.getParcelas().length);
		System.out.println("tamanho: " + c2.getParcelas().length);
	}
}
