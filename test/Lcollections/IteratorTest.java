package Lcollections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 10d, 0);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 3);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		/*
		 * Implementacao problematica pois o tamanho da lista nao pode ser alterado
		 * usando o for each.
		 */
//		for (Produto produto : produtos) {
//			if (produto.getQuantidade() == 0)
//				produtos.remove(produto);
//		}

		/*
		 * Implementacao adequada.
		 * Toda collection pode ser manipulada pelo Iterator
		 * hasNext: true (tem um proximo) || false (nao tem um proximo elemento)
		 * next: devolve o proximo elemento
		 */
		Iterator<Produto> produtoIterator = produtos.iterator();
		System.out.println(produtos.size());
		while (produtoIterator.hasNext()) {
			if (produtoIterator.next().getQuantidade() == 0) {
				produtoIterator.remove();
			}
		}
		System.out.println(produtos.size());
	}
}
