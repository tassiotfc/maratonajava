package Kwrapper;

public class WrapperTest {
	public static void main(String[] args) {
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 1;
		long longPrimitivo = 1L;
		float floatPrimitivo = 1F;
		double doublePrimitivo = 1D;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;

		// Wrapper sao objetos dos tipos primitivos
		// Oferecem varios metodos uteis para a manipulacao dos dados
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = 1;
		Long longWrapper = 1L;
		Float floatWrapper = 1F;
		Double doubleWrapper = 1D;
		Character characterWrapper = 'A';
		Boolean booleanWrapper = true;

		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetterOrDigit('#'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toUpperCase('9'));
		System.out.println(Float.parseFloat("1.06"));
	}

}
