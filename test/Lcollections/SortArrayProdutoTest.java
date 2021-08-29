package Lcollections;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayProdutoTest {
	public static void main(String[] args) {
		Produto[] produtosArray = new Produto[4];

		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);

		produtosArray[0] = produto1;
		produtosArray[1] = produto2;
		produtosArray[2] = produto3;
		produtosArray[3] = produto4;

		// ordenando um array com a implementacao do compareTo
		Arrays.sort(produtosArray);
		for (Produto produto : produtosArray) {
			System.out.println(produto);
		}

		// versao 1 da ordenacao usando o compare
		System.out.println();
		System.out.println("----- Comparator Classe Concreta ----------------------");
		Arrays.sort(produtosArray, new ProdutoNomeComparator());
		for (Produto produto : produtosArray) {
			System.out.println(produto);
		}

		// versao 2 da ordenacao usando o compare
		System.out.println();
		System.out.println("----- Comparator Classe Anonima ----------------------");
		Comparator<Produto> objetoComparate = new Comparator<>() {
			@Override
			public int compare(Produto o1, Produto o2) {
				Double o1Aux = o1.getPreco();
				return o1Aux.compareTo(o2.getPreco());
			}
		};
		Arrays.sort(produtosArray, objetoComparate);
		for (Produto produto : produtosArray) {
			System.out.println(produto);
		}

		// versao 3 da ordenacao usando o compare
		System.out.println();
		System.out.println("----- Comparator Lambda ----------------------");
		Arrays.sort(produtosArray, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
		for (Produto produto : produtosArray) {
			System.out.println(produto);
		}
	}
}