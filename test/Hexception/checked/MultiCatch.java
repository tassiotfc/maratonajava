package Hexception.checked;

public class MultiCatch {

	public static void main(String[] args) {
		// java 6
		try {
			throw new IndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dentro de ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("dentro de IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("dentro de IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("dentro de ArithmeticException");
		}
		System.out.println("Final do programa");

		// regra de multiplas exceptions:
		// sempre da mais especificas pra mais generica

		// java 7
		try {
			throw new IndexOutOfBoundsException();
		} catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("dentro de IndexOutOfBoundsException");
		} 
		System.out.println("Final do programa");
		
		//regra geral: nao pode ter super classe e subclasses no multicatch, ou seja,
		//as classes devem ser do mesmo nivel de heranca
	}

}
