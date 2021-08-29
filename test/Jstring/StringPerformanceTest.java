package Jstring;

import java.util.Iterator;

public class StringPerformanceTest {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(100000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
		concatStringBuilder(10000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
		concatStringBuffer(10000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
	}

	public static void concatString(int tam) {
		String str = "";
		for (int i = 0; i < tam; i++) {
			str += i;
		}
	}

	// Adequado em ambientes singlethreads.
	private static void concatStringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}

	// StringBuffer possui exatamente os mesmos metodos de StringBuilder
	// A diferenca eh que StringBuffer eh Thread-Safe (as regioes criticas sao
	// protegidas de acesso por mais de uma thread).
	// Adequado em ambientes multithreads.
	// Isto implica que todos os metodos sao sincronizados, impedindo acesso de duas
	// ou mais threads aos mesmo metodo.
	private static void concatStringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
}
