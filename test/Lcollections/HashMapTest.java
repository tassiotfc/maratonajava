package Lcollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //nao garante ordem e nem pode ser ordenado
		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "voce");
		map.put("notebooc", "notebook");

		System.out.println("--------Chaves----------------");
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("--------Valores---------------");
		for (String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("--------Chaves, Valores---------------");
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry);
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}
	}
}
