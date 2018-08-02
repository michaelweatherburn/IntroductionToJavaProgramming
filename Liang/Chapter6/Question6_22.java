import java.util.Scanner;
public class Question6_22 {
	static final double ACCEPTABLE_MARGIN_OF_ERROR = 1E-16;
	//we're reducing the margin of error to infinitesimal values
	public static double sqrt(long n) {
		/*
			We can start at any non-negative integer value for the initial guess value for the square root of n
			I chose a do-while loop, because lastGuess would not have to be initialized with a fake value before it is set to nextGuess in the first iteration of the loop
		*/
		double nextGuess = n, lastGuess;
		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2.0;
		}	while(Math.abs(lastGuess - nextGuess) > ACCEPTABLE_MARGIN_OF_ERROR);

		return nextGuess;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		long n = scanner.nextLong();
		System.out.println("The square root of n within acceptable error margins is " + sqrt(n));

	}
}