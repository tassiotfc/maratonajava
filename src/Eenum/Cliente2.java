package Eenum;

public class Cliente2 {
	private String nome;
	private TipoCliente2 tipo;

	public Cliente2(String nome, TipoCliente2 tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nome=" + this.nome + ", tipo=" + tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente2 getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente2 tipo) {
		this.tipo = tipo;
	}
}
