import acm.program.*;

public class FibonacciNumbers extends ConsoleProgram {
	private static final int UPPER_BOUND = 100000;

	public void run() {

		int firstNumber = 0;
		int secondNumber = 1;

		while (firstNumber < UPPER_BOUND || secondNumber < UPPER_BOUND) {
			println(firstNumber);
			println(secondNumber);
			firstNumber = firstNumber + secondNumber;
			secondNumber = firstNumber + secondNumber;
			
		}
	}

}
