package Bmodificadorestatico;

public class Carro {

	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;

	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite; //Carro em vez de this pq eh um atributo da classe
	}

	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprime() {
		System.out.println("------------------------------");
		System.out.println("Nome " + this.nome);
		System.out.println("Velocidade maxima " + this.velocidadeMaxima);
		System.out.println("Velocidade limite " + velocidadeLimite);
	}
}
