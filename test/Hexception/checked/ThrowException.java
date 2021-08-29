package Hexception.checked;

import java.io.File;
import java.io.IOException;

public class ThrowException {
	public static void main(String[] args) {
		try {			
			createFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFile() throws IOException{
		File file = new File("Teste.txt");
		
		file.createNewFile();
		System.out.println("File created");

	}
}
