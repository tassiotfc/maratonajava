package Hexception.error;

public class ErrorTest {
	public static void main(String[] args) {
		stackOverflowError();
	}

	public static void stackOverflowError() {
		stackOverflowError();
	}
}
