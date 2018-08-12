public class Question6_38 {
		public static final int NUMBER_OF_CHARACTERS = 100;
		public static final int NUMBER_OF_CHARACTERS_PER_LINE = 10;

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomUppercaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigit() {
		return getRandomCharacter('0', '9');
	}

	public static void printCharacters(char characterType) {
		for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
			if (i % NUMBER_OF_CHARACTERS_PER_LINE == 0)
				System.out.println();
			System.out.print((Character.isUpperCase(characterType) ? getRandomUppercaseLetter() : getRandomDigit()) + " ");
		}
	}

	public static void printUppercaseLetters() {
		printCharacters('A');
	}

	public static void printDigits() {
		printCharacters('0');
	}

	public static void main(String[] args) {
		final int NUMBER_OF_CHARACTERS = 100;
		final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
		printUppercaseLetters();
		printDigits();
	}
}