import acm.program.*;
import acm.util.*;

/* a program that simulates tossing coins until three heads and three tails have come up. */
public class ThreeOfEach extends ConsoleProgram {
	public void run() {

		RandomGenerator rgen = RandomGenerator.getInstance();

		
		int heads = 0;
		int tails = 0;		

		while (heads<3 || tails<3) {
			int z = rgen.nextInt( 0, 1);

			if (z == 0) {
				heads += 1;
				println("heads");
				
			} else if(z == 1) {
				tails += 1;
				println("tails");
			}
		}

	}
}
