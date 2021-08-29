package Lcollections;

import java.util.Set;
import java.util.HashSet;

public class HastSetTest {
	public static void main(String[] args) {
		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("012", "Samsung galaxy S6 64Gb", 3250.5, 0);
        Set<Produto> produtoSet = new HashSet<>(); //nao garante ordem e nem pode ser ordenado
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produto p : produtoSet){
            System.out.println(p);
        }
	}
}
