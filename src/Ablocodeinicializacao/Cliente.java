package Ablocodeinicializacao;

public class Cliente {
	/*
	 * Ordem de inicialização de um objeto Java:
	 * 1 - Alocado espaco na memoria para o objeto que sera criado
	 * 2 - Cada atributo de classe eh criado e inicilizado com seu valores default ou valor especificos
	 * 3 - Bloco de inicializacao eh executado
	 * 4 - Construtor eh executado 
	 */
	private int[] parcelas;
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializacao");
		for (int i = 1; i <= parcelas.length; i++) {
			parcelas[i-1] = i;
		}
	}
	
	public int[] getParcelas() {
		return parcelas;
	}
	
	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
}
