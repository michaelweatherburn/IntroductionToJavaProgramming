public class Question6_30 {
	public static int rollDice() {
		return ((int)(Math.random() * 6) + 1);
	}

	public static void printWinMessage() {
		System.out.println("You win");
	}

	public static void printLoseMessage() {
		System.out.println("You lose");
	}

	public static void loopingPhaseCraps(int points) {
		System.out.println("point is " + points);
		int sum, firstDiceRoll, secondDiceRoll;
		while (true) {
			firstDiceRoll = rollDice();
			secondDiceRoll = rollDice();
			sum = firstDiceRoll + secondDiceRoll;
			System.out.println("You rolled " + firstDiceRoll + " + " + secondDiceRoll + " = " + sum);
			if (sum == points) {
				System.out.println("You win");
				break;
			}
			else if (sum == 7) {
				System.out.println("You lose");
				break;
			}
		}
	}

	public static void craps() {
		int firstDiceRoll = rollDice();
		int secondDiceRoll = rollDice();
		int sum = firstDiceRoll + secondDiceRoll;

		System.out.println("You rolled " + firstDiceRoll + " + " + secondDiceRoll + " = " + sum);
		if (sum == 2 || sum == 3 || sum == 12) {
			// Craps - Sum is 2/3/12
			printLoseMessage();
		}
		else if (sum == 7 || sum == 11) {
			// Natural - Sum is 7/11
			printWinMessage();
		}
		else {
			// else if sum is 4/5/6/8/9
			loopingPhaseCraps(sum);
		}
	}

	public static void main(String[] args) {
		craps();
	}
}