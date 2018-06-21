public class RandomCharacter
{
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter() {
		return (char)('a' + Math.random() * ('z' - 'a' + 1));
	}

	public static char getRandomUpperCaseLetter() {
		return (char)('A' + Math.random() * ('Z' - 'A' + 1));
	}

	public static char getRandomDigitCharacter() {
		return (char)('0' + Math.random() * ('9' - '0' + 1));
	}

	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}