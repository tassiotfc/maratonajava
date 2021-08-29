package Mio;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
	public static void main(String[] args) throws IOException {
		File diretorio = new File("folder");
		System.out.println("Diretorio criado: " + diretorio.mkdir());

		File arquivo = new File(diretorio, "arquivo.txt");
		System.out.println("Arquivo criado: " + arquivo.createNewFile());

		File arquivoRenomeado = new File(diretorio, "arquivo_renomeado.txt");
		System.out.println("Arquivo renomeado: " + arquivo.renameTo(arquivoRenomeado));

		File diretorioRenomeado = new File("folder_renomeado");
		System.out.println("Diretorio renomeado: " + diretorio.renameTo(diretorioRenomeado));
		
		File arquivo1 = new File(diretorioRenomeado, "arquivo1.txt");
		System.out.println("Arquivo1 criado: " + arquivo1.createNewFile());
		
		File arquivo2 = new File(diretorioRenomeado, "arquivo2.txt");
		System.out.println("Arquivo2 criado: " + arquivo2.createNewFile());
		
		System.out.println("-----------Arquivos da pasta \"" + diretorioRenomeado.getName() + "\"-----------");
		String[] list = diretorioRenomeado.list();
		for (String file : list) {
			System.out.println(file);
		}
	}
}