package Lcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertListToArrayTest {
	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(2);
		listOfNumbers.add(0);
		listOfNumbers.add(4);
		listOfNumbers.add(3);

		Integer[] arrayOfNumbers = new Integer[listOfNumbers.size()];
		listOfNumbers.toArray(arrayOfNumbers);

		System.out.println("Lists: " + listOfNumbers);
		System.out.println("Array: " + Arrays.toString(arrayOfNumbers));

		System.out.println("-----------------------------");

		Integer[] arrayOfNumbers2 = new Integer[4];
		arrayOfNumbers2[0] = 10;
		arrayOfNumbers2[1] = 9;
		arrayOfNumbers2[2] = 8;
		arrayOfNumbers2[3] = 7;

		System.out.println("---------Convertendo array pra lista sem permitir insercao----------------");
		List<Integer> listOfNumbers2 = Arrays.asList(arrayOfNumbers2);// aponta para o mesmo array
		
		System.out.println("List:  " + listOfNumbers2);
		// evidencia de que aponta pro mesmo array
		Collections.sort(listOfNumbers2);
		System.out.println("Array: " + Arrays.toString(arrayOfNumbers2));
		System.out.println("List:  " + listOfNumbers2);
		// numeros2.add(6); //produz exception devido apontar para um array

		System.out.println("-----Permitindo insercao--------");
		List<Integer> listOfNumbers3 = new ArrayList<>();
		listOfNumbers3.addAll(Arrays.asList(arrayOfNumbers2));
		listOfNumbers3.addAll(Arrays.asList(1, 2));
		Collections.shuffle(listOfNumbers3);
		System.out.println("Array: " + Arrays.toString(arrayOfNumbers2));
		System.out.println("List:  " + listOfNumbers3);
		
		listOfNumbers2.set(0, 13);
		
		System.out.println("List: " + listOfNumbers2);
	}
}
