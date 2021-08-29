package Hexception.checked;

import java.io.File;
import java.io.IOException;

public class TryCatchException {
	public static void main(String[] args) {
		createFile();
	}

	public static void createFile() {
		File file = new File("Teste.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
