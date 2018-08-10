public class Question6_32 {

	public static int winCount = 0;

	public static int rollDice() {
		return ((int)(Math.random() * 6) + 1);
	}

	public static void loopingPhaseCraps(int points) {
		int sum, firstDiceRoll, secondDiceRoll;
		while (true) {
			firstDiceRoll = rollDice();
			secondDiceRoll = rollDice();
			sum = firstDiceRoll + secondDiceRoll;
			if (sum == points) {
				winCount++;
				break;
			}
			else if (sum == 7) {
				//Lost - do nothing, but break out of the loop
				break;
			}
		}
	}

	public static void craps() {
		int firstDiceRoll = rollDice();
		int secondDiceRoll = rollDice();
		int sum = firstDiceRoll + secondDiceRoll;

		if (sum == 2 || sum == 3 || sum == 12) {
			// Craps - Sum is 2/3/12
			// Do nothing
		}
		else if (sum == 7 || sum == 11) {
			// Natural - Sum is 7/11
			winCount++;
		}
		else {
			// else if sum is 4/5/6/8/9
			loopingPhaseCraps(sum);
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			craps();
		}
		System.out.println("Number of times won: " + winCount);
	}
}