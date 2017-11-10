import java.util.Scanner;
public class Question5_9
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number of students. ");
		int numberOfStudents = scannerObject.nextInt();

		String highestScoringStudent = "";
		String secondHighestScoringStudent = "";

		int highestScore = 0;
		int secondHighestScore = 0;

		String currentStudent = "";
		int currentScore = 0;
		int count = 0;
		while (count < numberOfStudents)
		{
			// rid the input buffer of the extra newline character leftover by previous nextInt methods
			scannerObject.nextLine();

			// input the current student's name and score
			System.out.println("Student #" + (count + 1));
			System.out.print("Name: ");
			currentStudent = scannerObject.nextLine();

			System.out.print("Score: ");
			currentScore = scannerObject.nextInt();

			// check if the current student's score is greater than the greatest score
			if (currentScore > highestScore)
			{
				// first, overwrite the value of the older secondHighestScore, setting the highestScore as the new secondHighestScore
				secondHighestScore = highestScore;
				secondHighestScoringStudent = highestScoringStudent;

				// then, set the value of the highestScore as that of currentScore
				highestScore = currentScore;
				highestScoringStudent = currentStudent;
			}
			// if not, check whether the current student's score is greater than the second greatest score
			else if (currentScore > secondHighestScore)
			{
				// if yes, simply overwrite the value of the secondHighestScore with the currentScore
				secondHighestScore = currentScore;
				secondHighestScoringStudent = currentStudent;
			}

			// within two iterations, your list would contain proper values

			count++;
		}

		System.out.println("Highest Scoring Student: " + highestScoringStudent);
		System.out.println("Second Highest Scoring Student: " + secondHighestScoringStudent);
	}
}