package Eenum;

public class ClienteTest1 {
	public static void main(String[] args) {
		Cliente1 cliente1 = new Cliente1("Pedro", Cliente1.PESSOA_FISICA);
		Cliente1 cliente2 = new Cliente1("Joao", 10); 	//10 em tese nao eh valido mas foi aceito, 
														//imagine este cenario usando BD.
		System.out.println(cliente1);
		System.out.println(cliente2);
	}
}
