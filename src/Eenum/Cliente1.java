package Eenum;

public class Cliente1 {
	private String nome;
	public static final int PESSOA_FISICA = 1;
	public static final int PESSOA_JURIDICA = 2;
	private int tipo;
	
	public Cliente1(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String tipo;
		if (this.tipo == PESSOA_FISICA)
			tipo = "Pessoa Fisica";
		else 
			tipo = "Pessoa Juridica";
		return "Nome=" + this.nome + ", tipo=" + tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public static int getPessoaFisica() {
		return PESSOA_FISICA;
	}

	public static int getPessoaJuridica() {
		return PESSOA_JURIDICA;
	}
}
