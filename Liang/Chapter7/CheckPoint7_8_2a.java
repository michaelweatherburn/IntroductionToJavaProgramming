public class CheckPoint7_8_2a {
	public static void main(String[] args) {
		int number = 0;
		int[] numbers = new int[1];
		m(number, numbers);
		System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
	}

	public static void m(int x, int[] y) {
		x = 3;
		y[0] = 3;
	}

	/* 
	When primitive values are passed by value, the value of the variable is copied from the actual parameter (argument) to the formal parameter("parameter" in short)

	The value 0 is copied from the variable number (in the activation record/frame of the main method) to the variable x (in the activation record/frame of the m method). After that, x is set to 3. As the method finishes executing, the activation record of m is popped off the stack, and along with it goes the new value of 3. The variable number still contains the value 0.

	When reference datatypes (arrays/objects) are passed by value, the reference of the actual array/object is copied over from the actual parameter (argument) to the formal parameter("parameter")

	The reference to an array of only one integer is copied over from numbers (in the activation record/frame of the main method) to y (present in the activation record/frame of the m method). This means that numbers and m now point to the same array. 

	The reference y is then used to set the only element in the array to 3. Since this element resides in the heap, the change is not local to the activation frame/record of the method (that's just where the reference to the array lives for the moment), the change occurs in the heap.

	As the method finishes executing, the activation record of m is popped off the stack, but since the change was made inside the heap, the changed value (3) can still be accessed using the old reference numbers.

	Output:
	number is 0 and numbers[0] is 3
	*/
}