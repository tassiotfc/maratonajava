package Mio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine(); // eh portavel, pois o '\n' nao eh valido pra todo SO
			bw.write("E pulando uma linha 3");
			bw.flush();
			bw.close();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// usando trywithresource
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//				BufferedReader br = new BufferedReader(new FileReader(file));) {
//			bw.write("Escrevendo uma mensagem no arquivo");
//			bw.newLine(); // eh portavel, pois o '\n' nao eh valido pra todo SO
//			bw.write("E pulando uma linha 3");
//			bw.flush();
//
//			String s = null;
//			while ((s = br.readLine()) != null) {
//				System.out.println(s);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
