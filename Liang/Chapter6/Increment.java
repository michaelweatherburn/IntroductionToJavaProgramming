// this program demonstrates that pass-by-value does not affect the value of the actual parameters, no matter what happens to the formal parameters inside the method
public class Increment {
	public static void main(String[] args)
	{
		int x = 1;
		System.out.println("Before the call to the Increment method, the value of x is " + x);
		increment(x);
		System.out.println("After the call to the Increment method, the value of x is " + x);
	}

	public static void increment(int n)
	{
		// This variable n that you see is separate from the variable x that is present in the main method
		// Remember that x is a variable that has a value inside the activation frame of the main method
		// whereas n is a variable that has a value inside the activation frame of the increment method
		// therefore, when n is changed inside the activation frame of the increment method, there is no way
		// for the main method to be communicated of this change (notice that increment does not return a value)
		n++;
		System.out.println("The value of n after the increment, inside the method, is: " + n);
	}
}