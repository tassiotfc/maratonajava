package Lcollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class ConsumidorNomeComparator implements Comparator<Consumidor> {
	public int compare(Consumidor arg0, Consumidor arg1) {
		return arg0.getNome().compareTo(arg1.getNome());
	};
}

public class TreeMapTest {
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("William Suane", "122");
		Consumidor consumidor2 = new Consumidor("DevDojo", "321");

		Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);

		// ordenando usando o compare, a outra possibilidade eh implementar compareTo 
		NavigableMap<Consumidor, List<Produto>> treeMap = new 
				TreeMap<>(new ConsumidorNomeComparator());

		List<Produto> produtosCon1 = new ArrayList<>();
		produtosCon1.add(produto1);
		produtosCon1.add(produto2);
		List<Produto> produtosCon2 = new ArrayList<>();
		produtosCon2.add(produto3);
		produtosCon2.add(produto4);

		treeMap.put(consumidor1, produtosCon1);
		treeMap.put(consumidor2, produtosCon2);
		for (Map.Entry<Consumidor, List<Produto>> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}