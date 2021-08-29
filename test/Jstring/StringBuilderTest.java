package Jstring;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str1 = "Tassio";
		str1.concat(" Fernandes");
		System.out.println(str1);
		
		StringBuilder str2 = new StringBuilder(50);
		str2.append("Tassio");
		str2.append(" Fernandes");
		System.out.println(str2);
		
		StringBuffer str3 = new StringBuffer(50);
		str3.append("Tassio");
		str3.append(" Fernandes");
		System.out.println(str3);
		
		System.out.println(str2.reverse());
		System.out.println(str2.reverse().delete(0, 3));
		System.out.println(str2.insert(0, "Tas"));
	}
}