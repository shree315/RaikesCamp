import acm.program.*;
import acm.util.*;

/* a program that asks the user for how many marbles each player has, then plays the game until one of the players runs out of marbles.
 */
public class CoinFlippingGame extends ConsoleProgram {
	public void run() {
		
		RandomGenerator rgen = RandomGenerator.getInstance();
		
		int player1 = readInt("How many marbles does the first player have? ");
		int player2 = readInt("How many marbles does the second player have? ");
		
		
		
		while (player1==0 || player2==0) {
			int z = rgen.nextInt(0, 1);
			
		if (z==0) {
			player1 +=1;
			player2 -=1;
					
			println ("Flipped heads! First player has " + player1 + " , second player has " + player2 + " .");
		} else {
			player1 -=1;
			player2 +=1;
				println ("Flipped tails! First player has " + player1 + " , second player has " + player2 + " .");
			}
		}
		}
}
