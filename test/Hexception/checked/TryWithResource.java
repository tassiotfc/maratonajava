package Hexception.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import Hexception.Leitor1;
import Hexception.Leitor2;

public class TryWithResource {
	public static void main(String[] args) {
		lerArquivo();
	}
	
	//java 7
	public static void lerArquivo() {
		//try aceita parametro somente de quem
		//implementa AutoCloseable
		//eh uma forma mais elegante de fechar
		//arquivos, conexoes, ...
        try (Leitor2 leitor2 = new Leitor2();
             Leitor1 leitor1 = new Leitor1()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	//java 6
	public static void lerArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
