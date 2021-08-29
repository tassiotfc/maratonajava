package Lcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoNomeComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}

public class SortListProdutoTest {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		// ordenacao usando a implementacao do compareTo
		Collections.sort(produtos);
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

		// versao 1 da ordenacao usando o compare
		System.out.println();
		System.out.println("----- Comparator Classe Concreta ----------------------");
		Collections.sort(produtos, new ProdutoNomeComparator());
		produtos.forEach(produto -> System.out.println(produto)); // novidade a partir do Java 8

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
		Collections.sort(produtos, objetoComparate);
		produtos.forEach(produto -> System.out.println(produto)); // novidade a partir do Java 8
		
		// versao 3 da ordenacao usando o compare
		System.out.println();
		System.out.println("----- Comparator Lambda ----------------------");
		Collections.sort(produtos, (o1, o2)-> o1.getNome().compareTo(o2.getNome()));
		produtos.forEach(produto -> System.out.println(produto)); // novidade a partir do Java 8
	}
}