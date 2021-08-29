package Aarray;

public class Arrays2 {
	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";

		for (int i = 0; i < nomes.length; i++) {
			System.out.println((i + 1) + " nome " + nomes[i]);
		}

		nomes = new String[4];
		
		nomes[0] = "Felipe";
		nomes[1] = "Jorge";
		nomes[2] = "Willian";
		nomes[3] = "Pedro";
		System.out.println("-------------------------------");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println((i + 1) + " nome " + nomes[i]);
		}
	}
}
