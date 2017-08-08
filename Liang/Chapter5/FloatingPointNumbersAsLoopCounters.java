public class FloatingPointNumbersAsLoopCounters
{
	public static void main(String[] args)
	{
		double item = 1;
		double sum = 0;

		while(item != 0)
		{
			sum += item;
			item -= 0.1;
			System.out.println("Item: " + item);
		}
		System.out.println(sum);
	}
/* 

Output:

Item: 0.9
Item: 0.8
Item: 0.7000000000000001
Item: 0.6000000000000001
Item: 0.5000000000000001
Item: 0.40000000000000013
Item: 0.30000000000000016
Item: 0.20000000000000015
Item: 0.10000000000000014
Item: 1.3877787807814457E-16
Item: -0.09999999999999987
Item: -0.19999999999999987
Item: -0.2999999999999999

Imprecision in double results begin to appear after 0.8. Also, perfect zero is not achieved. Instead we get a very small number close to 0. That's why the comparison failed and the loop stepped over.

*/
}