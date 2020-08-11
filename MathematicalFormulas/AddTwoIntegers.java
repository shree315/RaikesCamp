import acm.program.*;

public class AddTwoIntegers extends ConsoleProgram {
	public void run() {
		println("This program adds two integers.");
		
		// Read two values from the user.
		int n1 = readInt("Enter first integers: ");
		int n2 = readInt("Enter second integers: ");
		
		// Compute their sum.
		int sum = n1 + n2;
		
		// Print out the summation
		println("The sum of those numbers is " + sum);
	}
}
