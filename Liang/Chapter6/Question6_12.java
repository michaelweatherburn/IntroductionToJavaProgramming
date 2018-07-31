public class Question6_12 {
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int numbersPrinted = 0;
		for (char currentCharacter = ch1; currentCharacter <= ch2; currentCharacter++) {
			System.out.print(currentCharacter + " ");
			numbersPrinted++;
			if (numbersPrinted % numberPerLine == 0)
				System.out.println();
		}
	}

	public static void main(String[] args) {
		printChars('1', 'Z', 10);	
	}
}