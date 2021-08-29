package Dmodificadorfinal;

public class Carro {
    public static final double VELOCIDADE_FINAL = 250; //constante da classe
    public final Comprador COMPRADOR = new Comprador(); //constante do objeto
	private String nome;
    private String marca;
	
    public final void imprime() { //nao pode ser reescrito
    	System.out.println("Imprimindo um carro"); 
    }
    
    @Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}    
}
