import java.util.Scanner;
public class TypesOfLoops
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		/* There are two kinds of loops: 

		1) Counter-controlled loops
		The number of iterations in this loop is equal to the number of times a counter is counted before it violates a numeric condition. This is the most commond kind of loop.

		for(int i = 0; i < 5; i++)
		{
		//here, i is the counter. This is a counter controlled-loop. Update expressions of counter-controlled loops usually have the operators >, >=, <, <=.
		}

		2) Sentinel-controlled loops
		The number of iterations in this loop is not "counted". Instead, some input taken in each iteration is used to decide whether the next iteration would be executed or not.
		*/

		//counter-controlled loop
		for(int i = 0; i < 5; i++)
		{
			System.out.println("loop counter value: " + i);
		}

		//sentinel-controlled loop
		int a;
		do
		{
				System.out.println("Enter a number. Enter 0 to exit. ");
				a = scanner.nextInt();
				System.out.println("Value of sentinel character: " + a);
		} while(a != 0);

		/* Sentinel literally means "guard". This sentinel-value is the value that provides a border-condition for the loop's termination. Earlier in C, traversing a String of unknown length could be done using a for loop like this:

		for(int i = 0; stringArray[i] != '\0'; i++)
		{
			//code
		}

		This is an example of sentinel-controlled loop. Sure, you're counting the number i, but you don't know the exit condition yourself. In fact, the character '\0' was called a sentinel character in C.

		for(int i = 0; i < strlen(stringArray); i++)
		{
			//code
		}
		This is a counted version of the sentinel-controlled loop. There's no special variable that, upon becoming false, will cause the loop to exit. Instead, there's the length of the array, that you're counting upto.
		*/
	}
}