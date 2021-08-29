package FInterface;

public class InterfaceTest {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 1.8, 2500);
		produto.calculaFrete();
		produto.calculaImposto();
		System.out.println(produto);
		
		Carro carro = new Carro("Onix", 980, 59000);
		carro.calculaImposto();
		System.out.println(carro);
	}

}
