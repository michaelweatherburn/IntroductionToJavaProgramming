import java.util.Scanner;
public class ComparisonMethodsInStringObject
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    String s1 = "Subham";
    String s2 = "subham";
    String s3 = "sub";
    String s4 = "ham";
    String s5 = "bh";

    /* the equals and equalsIgnoreCase methods are used to check for String equality */
    System.out.println("Are s1 and s2 logically same? " + s1.equals(s2));
    System.out.println("Are s1 and s2 logically the same, not considering the case? " + s1.equalsIgnoreCase(s2));

    /* the compareTo and CompareToIgnoreCase methods are used to check how apart the characters are ("lexicographically", in terms of Unicode ordering) from the the first point of difference when considered beginning to end
    */
    System.out.println("How does s1 fare with s2 in a dictionary? " + s1.compareTo(s2));
    System.out.println("How does s1 fare with s2 in a dictionary, not considering the case? " + s1.compareToIgnoreCase(s2));

    /*
      startsWith and endsWith check whether the input String starts or ends the current String, respectively.

      contains checks whether the input String is a substring of the current String (literally, whether the current String CONTAINS the input String).
    */
    System.out.println("Does s2 begin with s3? " + s2.startsWith(s3));
    System.out.println("Does s2 end with s3? " + s2.endsWith(s4));
    System.out.println("Does s2 contain s5? (Is s5 a substring of s2?) " + s2.contains(s5));

    //extras: negative cases
    System.out.println("Is s1 equal to \"subham\"? " + s1.equals("subham"));
    System.out.println("Is s1 equal to \"subham\", not considering the case? " + s2.equalsIgnoreCase("subham"));

    System.out.println("How does s2 fare with \"subham\" in a dictionary? " + s1.compareTo("subham"));
    System.out.println("How does s2 fare with \"subham\" in a dictionary? " + s1.compareToIgnoreCase("subham"));

    System.out.println("Does s2 begin with \"amb\"? " + s2.startsWith("amb"));
    System.out.println("Does s2 end with \"ush\"? " + s2.endsWith("ush"));
    System.out.println("Does s2 contain s5? (Is s5 a substring of \"no\"?) " + s2.contains("no"));

  }
}
