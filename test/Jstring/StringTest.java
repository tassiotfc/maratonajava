package Jstring;

public class StringTest {
	public static void main(String[] args) {
		/*
		 * String eh imutavel
		 */
		String str1 = "Tassio";
		str1.concat(" Fernandes");
		System.out.println(str1); // String eh imutavel
		String str2 = "Tassio";
		System.out.println(str1.equals(str2)); // compara os valores
		System.out.println(str1 == str2); // compara os valores
		String str3 = new String("Mateus"); // 1 - Variavel de referencia, 2 - Um objeto do tipo string, 3 - Uma string
											// no pool de String
		String str4 = new String("Mateus");
		str3.contains(" Fernandes");
		System.out.println(str3);
		System.out.println(str3.equals(str4)); // compara os valores
		System.out.println(str3 == str4); // compara os enderecos
		str4 = "mateus";
		System.out.println(str4.equalsIgnoreCase(str3));
		System.out.println(str3.length());
		System.out.println(str3.charAt(4));
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toUpperCase().toLowerCase());
		System.out.println(str3.replace("t", "th"));
		System.out.println(str3.substring(2, 6));
		str3 = "    Mateus Fernandes     ";
		System.out.println(str3);
		System.out.println(str3.trim());
	}
}