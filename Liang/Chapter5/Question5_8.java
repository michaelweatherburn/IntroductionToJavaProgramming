import java.util.Scanner;
public class Question5_8
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number of students. ");
		int numberOfStudents = scannerObject.nextInt();
		String highestScoringStudent = "";
		int highestScore = 0;
		int count = 0;

		String currentStudent = "";
		int currentScore = 0;
		while (count < numberOfStudents)
		{
			System.out.println("Student #" + (count + 1));
			System.out.print("Name: ");

			/* Whenever you use nextInt, nextFloat or any other number input scanner method, the number is consumed from
			the buffer but the trailing newline is left behind. If a String is to be input next, the newline is interpreted
			by the upcoming nextLine/next method to be the end of input. That is why the new line needs to be consumed
			and removed from the buffer so that the input that follows may be available to the following next/nextLine
			method. This is what I"m doing below: */
			scannerObject.nextLine();
			currentStudent = scannerObject.nextLine();

			System.out.print("Score: ");
			currentScore = scannerObject.nextInt();

			if (currentScore > highestScore)
			{
				highestScore = currentScore;
				highestScoringStudent = currentStudent;
			}

			count++;
		}

		System.out.println("Highest Scoring Student: " + highestScoringStudent);
	}
}