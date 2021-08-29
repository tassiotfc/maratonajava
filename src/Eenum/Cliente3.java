package Eenum;

public class Cliente3 {
	public enum TipoPagamento{
		AVISTA, APRAZO
	}
	private String nome;
	private TipoCliente3 tipoCliente3;
	private TipoPagamento tipoPagamento;

	public Cliente3(String nome, TipoCliente3 tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente3 = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	@Override
	public String toString() {
		return "Nome:" + nome + ", "
				+ "TipoCliente:" + tipoCliente3 + ", "
						+ "TipoPagamento:" + tipoPagamento + ", "
								+ "Numero:" + tipoCliente3.getTipo() + ", "
										+ "Descricao: " + tipoCliente3.getDescricao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente3 getTipoCliente3() {
		return tipoCliente3;
	}

	public void setTipoCliente3(TipoCliente3 tipoCliente3) {
		this.tipoCliente3 = tipoCliente3;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
