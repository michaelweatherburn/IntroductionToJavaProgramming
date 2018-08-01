import java.util.Scanner;
public class Question6_21 {
	public static int getNumber(char uppercaseLetter) {
		int numberCorrespondingToLetter = 1;	// the voicemail, the default in case I couldn't find a valid input

		if ('A' <= uppercaseLetter && uppercaseLetter <= 'C')
			numberCorrespondingToLetter = 2;
		else if ('D' <= uppercaseLetter && uppercaseLetter <= 'F')
			numberCorrespondingToLetter = 3;
		else if ('G' <= uppercaseLetter && uppercaseLetter <= 'I')
			numberCorrespondingToLetter = 4;
		else if ('J' <= uppercaseLetter && uppercaseLetter <= 'L')
			numberCorrespondingToLetter = 5;
		else if ('M' <= uppercaseLetter && uppercaseLetter <= 'O')
			numberCorrespondingToLetter = 6;
		else if ('P' <= uppercaseLetter && uppercaseLetter <= 'S')
			numberCorrespondingToLetter = 7;
		else if ('T' <= uppercaseLetter && uppercaseLetter <= 'V')
			numberCorrespondingToLetter = 8;
		else if ('W' <= uppercaseLetter && uppercaseLetter <= 'Z')
			numberCorrespondingToLetter = 9;
		return numberCorrespondingToLetter;
	}

	public static String mapStringLettersToNumbers(String input) {
		input = input.toUpperCase();	// convert any lowercase letters to uppercase, leave the other characters intact
		String result = "";
		for (int i = 0, inputStringLength = input.length(); i < inputStringLength; i++ ) {
			if (Character.isLetter(input.charAt(i))) {
				// map to appropriate number, and concat the number to the string
				result += getNumber(input.charAt(i));
			} else {
				// concat directly into new string, leaving special and other characters intact
				result += input.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println(mapStringLettersToNumbers(input));
	}
}