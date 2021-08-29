package FInterface;

import java.text.DecimalFormat;

public class Carro implements Tributavel {
	private String modelo;
	private double peso;
	private double preco;
	private double precoFinal;
	
	@Override
	public void calculaImposto() {
		precoFinal = this.preco + (this.preco * IMPOSTO * 0.2);
	}

	public Carro(String modelo, double peso, double preco) {
		this.modelo = modelo;
		this.peso = peso;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#.00");
		return "Carro [modelo=" + modelo + ", "
				+ "peso=" + formato.format(peso) + ", "
						+ "preco=" + formato.format(preco) + ", "
								+ "precoFinal=" + formato.format(precoFinal) + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}	

}
