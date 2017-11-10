public class Question5_6
{
	public static void main(String[] args)
	{
		System.out.printf("%-15s%-15s%3s|%3s%-15s%-15s\n", "Miles", "Kilometres", "", "", "Kilometres", "Miles");
		for (int miles = 1, kilometres = 20; miles <= 10 && kilometres <= 65; miles++, kilometres += 5)
		{
			System.out.printf("%-15d%-15.3f%3s|%3s%-15d%-15.3f\n", miles, miles * 1.609, "", "", kilometres, kilometres / 1.609);
		}
	}
}