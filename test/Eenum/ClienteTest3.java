package Eenum;

public class ClienteTest3 {
	public static void main(String[] args) {
		Cliente3 cliente3 = new Cliente3("Augusto", TipoCliente3.PESSOA_FISICA, Cliente3.TipoPagamento.AVISTA);
		System.out.println(cliente3);
		System.out.println(cliente3.getTipoCliente3().getId());
		System.out.println(TipoCliente3.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente3.PESSOA_FISICA.getId());
	}
}