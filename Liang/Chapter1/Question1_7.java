import java.util.Scanner;

public class Question1_7
{

	public static int setSignum(int count){
		return (count % 2 == 0 ? -1 : +1);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of terms until which the series is to be calculated. ");
		int n = scanner.nextInt();
		scanner.close();
		double sum = 0;
		double answer;

		for(int i = 1; i <= n; i++){
			sum = sum + ( (double) setSignum(i) / (double) (2 * i - 1));
		}
		answer = sum * 4;

		System.out.println("Required sum: " + answer);
	}
}
