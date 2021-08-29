package Aarray;

import java.util.Arrays;

public class Arrays8 {

	public static void main(String[] args) {
		int[] array1 = new int[] {5, 3, 2};
		for (int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------");
		Arrays.sort(array1);
		for (int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, 3));
	}

}
