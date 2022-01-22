import java.util.Scanner;
public class CheckPoint3_13_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the year. ");
		int year = scanner.nextInt();

		scanner.close();

		String zodiac = null;
		int zodiacNumber = year % 12;

		if (zodiacNumber == 0) {
			zodiac = "Monkey";
		} else if (zodiacNumber == 1) {
			zodiac = "Rooster";
		} else if (zodiacNumber == 2) {
			zodiac = "Dog";
		} else if (zodiacNumber == 3) {
			zodiac = "Pig";
		} else if (zodiacNumber == 4) {
			zodiac = "Rat";
		} else if (zodiacNumber == 5) {
			zodiac = "Ox";
		} else if (zodiacNumber == 6) {
			zodiac = "Tiger";
		} else if (zodiacNumber == 7) {
			zodiac = "Rabbit";
		} else if (zodiacNumber == 8) {
			zodiac = "Dragon";
		} else if (zodiacNumber == 9) {
			zodiac = "Snake";
		} else if (zodiacNumber == 10) {
			zodiac = "Horse";
		} else if (zodiacNumber == 11) {
			zodiac = "Sheep";
		}

		System.out.println(zodiac);
	}
}