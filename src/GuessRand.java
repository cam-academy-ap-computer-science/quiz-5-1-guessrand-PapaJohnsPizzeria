import java.util.*;   
public class GuessRand {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int rand;
		boolean success = false;
		Random r = newRandom();
		rand = r.nextInt(100)+1;
		
		while (success = false) {
			System.out.println("Your Guess: ?");
			int guess = console.nextInt();
			success = compare(guess, guess);
		}
		private static Random newRandom() {
			return null;
		}
	}
	
	
	
	public static boolean compare(int guess, int rand) {
		boolean got_it = false;
		if (guess == rand) {  // Fix if test
			System.out.println("You got it!");
			got_it = true;
		} else if (guess < rand) {  // Fix if test
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}
}
