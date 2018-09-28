public class CountLettersInArray2 {
	public static void main(String[] args) {
		// Declare and create an array of 100 characters, also initialize the array
		char[] chars = createArray(100);

		// Display the array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println("\nThe occurrences of each letter are: ");
		displayCounts(counts);
	}

	public static char getRandomCharacter(char initialCharacter, int finalCharacter) {
		return (char) (Math.random() * (finalCharacter - initialCharacter + 1) + initialCharacter);
	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	public static char[] createArray(int arraySize) {
		// Declare an array of characters and create it
		char[] chars = new char[100];

		// Create lowercase letters randomly and assign them to the array
		for (int i = 0; i < chars.length; i++) {
			chars[i] = getRandomLowerCaseLetter();
		}

		// return the array
		return chars;
	}

	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	/** Count the occurrences of each letter */
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		//For each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}

		return counts;
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.print((char) (i + 'a') + " " + counts[i] + "\t");
			if ((i + 1) % 10 == 0) 
				System.out.println();
		}
	}
}