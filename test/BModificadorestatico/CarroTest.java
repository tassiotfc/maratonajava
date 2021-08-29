package BModificadorestatico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Bmodificadorestatico.Carro;

public class CarroTest {
	
	@Test
	void test() {
        Carro.setVelocidadeLimite(220);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);
        c1.imprime();
        c2.imprime();
        c3.imprime();
        assertEquals(Carro.getVelocidadeLimite(), 220);
	}
}