package Gpolimorfismo;

public class RelatorioPagamento {
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatorio de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário desse mês: " + funcionario.getSalario());
		if (funcionario instanceof Gerente) {
			System.out.println("Participacao nos lucros: " + ((Gerente) funcionario).getPnl());
		}
		if (funcionario instanceof Vendedor) {
			System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas());
		}

	}
}
