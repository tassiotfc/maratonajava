package Lcollections;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.NavigableSet;

//class ComparatorQuantidadeProd implements Comparator<Produto>{
//	@Override
//	public int compare(Produto arg0, Produto arg1) {
//		Integer arg0Aux = arg0.getQuantidade(); //autoboxing
//		return arg0Aux.compareTo(arg1.getQuantidade());
//	}
//}

public class TreeSetTest {
	public static void main(String[] args) {
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 10d, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 5);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 5);
		Produto produto5 = new Produto("012", "Samsung galaxy S6 64Gb", 3250.5, 6);
		NavigableSet<Produto> produtosTreeSet = new TreeSet<>(); // ordenado considerando o compareTo do objeto produto
		//NavigableSet<Produto> produtoSet = new TreeSet<>(new ComparatorQuantidadeProd());//ordenando usando o compare
		
		produtosTreeSet.add(produto1);
		produtosTreeSet.add(produto2);
		produtosTreeSet.add(produto3);
		produtosTreeSet.add(produto4);
		produtosTreeSet.add(produto5); // nao eh aceito pois Set nao permite duplicacao de elementos
		for (Produto p : produtosTreeSet) {
			System.out.println(p);
		}
		
		System.out.println("-----------Pegando os elementos na ordem inversa-----------");
		for (Produto p : produtosTreeSet.descendingSet()) {
			System.out.println(p);
		}
		
		System.out.println("Produto com preco < que o produto passado: " + produtosTreeSet.lower(produto5));
		System.out.println("Produto com preco <= que o produto passado: " + produtosTreeSet.floor(produto5));
		System.out.println("Produto com preco > que o produto passado: " + produtosTreeSet.higher(produto5));
		System.out.println("Produto com preco >= que o produto passado: " + produtosTreeSet.ceiling(produto5));
		System.out.println("Obtendo e removendo o primeiro elemento: " + produtosTreeSet.pollFirst());
		System.out.println(produtosTreeSet.size());
		System.out.println("Obtendo e removendo o ultimo elemento: " + produtosTreeSet.pollLast());
		System.out.println(produtosTreeSet.size());
	}
}