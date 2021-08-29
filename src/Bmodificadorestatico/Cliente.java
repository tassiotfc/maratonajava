package Bmodificadorestatico;

public class Cliente {
	/*
	 * Ordem de inicialização de um objeto Java: 
	 * 1 - Bloco de inicializacao estático eh executado quando a JVM carregar a 
	 * classe (é executado apenas 1 vez)
	 * 2 - Alocado espaco na memoria para o objeto que sera criado 
	 * 3 - Cada atributo de classe eh criado e inicilizado com seu valores 
	 * default ou valor especificos 
	 * 4 - Bloco de inicializacao eh executado 
	 * 5 - Construtor eh executado
	 */
	private static int[] parcelas;
	static {
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializacao");
		for (int i = 1; i <= parcelas.length; i++) {
			parcelas[i - 1] = i;
		}
	}

	public static int[] getParcelas() {
		return parcelas;
	}

	public static void setParcelas(int[] parcelas) {
		Cliente.parcelas = parcelas;
	}
}
