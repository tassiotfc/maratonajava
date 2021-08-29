package Hexception.checked;

public class TryCatchFinaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lerArquivo();
	}

	private static String lerArquivo() {
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Lendo do arquivo");
			System.out.println("Escrevendo...");
			return "retorna o arquivo";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando arquivo"); // Sempre eh executado, mesmo com o return, break ou continue antes.
													// So nao executa se houver um System.exit no try.
													// System.exit termina imediatamente o aplicativo.
		}
		return null;
	}

}
