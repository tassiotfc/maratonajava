package Aarray;

import java.util.Iterator;

import Bmodificadorestatico.Carro;

public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro[][] carros = new Carro[3][];
		carros[0] = new Carro[3];
		carros[1] = new Carro[2];
		carros[2] = new Carro[1];
		
		Carro c1 = new Carro("Palio", 180);
		Carro c2 = new Carro("Strada", 180);
		Carro c3 = new Carro("Uno", 180);
		Carro c4 = new Carro("Corolla", 220);
		Carro c5 = new Carro("Civic", 220);
		Carro c6 = new Carro("BMW", 300);
		
		carros[0][0] = c1;
		carros[0][1] = c2;
		carros[0][2] = c3;
		System.out.println("Carros populares");
		for (Carro carrosAux : carros[0]) {
			carrosAux.imprime();
		}
		
		carros[1][0] = c4;
		carros[1][1] = c5;
		System.out.println();
		System.out.println("Carros mediano");
		for (Carro carrosAux : carros[1]) {
			carrosAux.imprime();
		}
		
		carros[2][0] = c6;
		System.out.println();
		System.out.println("Carros luxuosos");
		for (Carro carrosAux : carros[2]) {
			carrosAux.imprime();
		}
		
		System.out.println();
		System.out.println("Todos os carros");
		for (Carro[] arrayDeCarros : carros) {
			for (Carro carro : arrayDeCarros) {
				carro.imprime();
			}
		}
	}

}
