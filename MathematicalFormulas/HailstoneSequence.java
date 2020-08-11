import acm.program.*;

/* The Hailstone Sequence is a famous sequence that works as follows:
 *   Begin with some number n.
 *   While n is not equal to 1:
 *     If n is even, divide n by two.
 *     If n is odd, multiply n by three, then add one.
 *
 * For example, the Hailstone sequence beginning at 13 is
 *
 *   13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */
public class HailstoneSequence extends ConsoleProgram {
	public void run() {

		int n = readInt("Pick a number: ");

		while (n > 1) {
			if (n % 2 == 0) {
				n = n/2;
			} else {
				n = n * 3 + 1;
			}
			println (n);
		}
	}
}
