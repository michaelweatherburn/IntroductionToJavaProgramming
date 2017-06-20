public class ConvertNumbersToStrings
{
  public static void main(String[] args)
  {
    /* This is a simple one-line technique, using the overloaded '+' operator to convert a number to a String */

    String s1 = ""; //empty string
    String s2 = "";
    s1 += 123.45;

    System.out.println(s1);
  }
}
