package Eenum;

public class ClienteTest2 {
	public static void main(String[] args) {
		Cliente2 cliente2 = new Cliente2("Zuck", TipoCliente2.PESSOA_FISICA); // nao permite outro valor que nao
																				// esteja especificado no enum
																				// TipoCliente
		System.out.println(cliente2);
	}
}