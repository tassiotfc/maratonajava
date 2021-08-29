package Gpolimorfismo;

public class PolimorfismoTest {

	public static void main(String[] args) {
		Gerente g = new Gerente("Oswaldo", 5000, 2000);
		Vendedor v = new Vendedor("Yuri", 2000, 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		relatorio.relatorioPagamentoGenerico(g);
		System.out.println("---------------------------");
		relatorio.relatorioPagamentoGenerico(v);

	}
}
