public class CheckPoint4_20
{
  public static void main(String[] args)
  {
    String s1 = " Welcome ";
    String s2 = " welcome ";

    boolean isEqual = s1.equals(s2);  //false: safe side: checks for both reference and content equality
    boolean isEqualWhenCaseIgnored = s1.equalsIgnoreCase(s2);  //true
    int x = s1.compareTo(s2); //should return 32, the difference between any character and its equivalent of the opposite case
    int y = s1.compareToIgnoreCase(s2);   //should return 0
    boolean b1 = s1.startsWith("AAA");
    boolean b2 = s1.endsWith("AAA");
    int x2 = s1.length();
    char c1 = s1.charAt(0);
    String s3 = s1 + s2;
    String substring1 = s1.substring(1);
    String substring2 = s1.substring(1,5);
    String s4 = s1.toUpperCase();
    String s5 = s1.toLowerCase();
    String trimmed = s1.trim();

    System.out.println(isEqual + " " + isEqualWhenCaseIgnored + " " + x + " " + y + " " + b1 + " " + b2 + " " + x2 + " " + c1);
    System.out.println(s3);
    System.out.println(substring1);
    System.out.println(substring2);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(trimmed);
  }
}
