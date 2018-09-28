public class CountLettersInArray {

	public static char getRandomCharacter(char initialCharacter, int finalCharacter) {
		return (char) (Math.random() * (finalCharacter - initialCharacter + 1) + initialCharacter);
	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	public static void main(String[] args) {
		char[] chars = new char[100];
		int[] counts = new int[26];	// no need to worry about counts, the default value for all int array elements is 0

		for (int i = 0; i < chars.length; i++) {
			chars[i] = getRandomLowerCaseLetter();
			counts[chars[i] - 'a']++;
		}

		System.out.println("Number of occurrences: ");
		for (int i = 0; i < counts.length; i++) {
			System.out.println((char)(i + 'a') + ": " + counts[i]);
		}
	}
}