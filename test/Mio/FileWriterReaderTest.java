package Mio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		try {
			FileWriter fw = new FileWriter(file); // ao reexecutar o programa, para continuar a escrita de onde parou,
													// use new FileWriter(file, true)
			fw.write("escrevendo uma mensagem no arquivo e pulando uma linha 2\n");
			fw.write("escrevendo uma mensagem no arquivo e pulando uma linha 3");
			fw.flush(); // limpar o buffer
			fw.close(); // poderia ser fechado usando try_with_resource, pois FileWriter implementa
						// closeable

			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho: " + size);
			for (char c : in) {
				System.out.print(c);
			}
			fr.close(); // poderia ser fechado usando try_with_resource, pois FileWriter implementa
						// closeable
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//usando trywithresource
//		try(FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {
//			fw.write("escrevendo uma mensagem no arquivo e pulando uma linha 2\n");
//			fw.write("escrevendo uma mensagem no arquivo e pulando uma linha 3");
//			fw.flush(); // limpar o buffer
//
//			char[] in = new char[500];
//			int size = fr.read(in);
//			System.out.println("tamanho: " + size);
//			for (char c : in) {
//				System.out.print(c);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}