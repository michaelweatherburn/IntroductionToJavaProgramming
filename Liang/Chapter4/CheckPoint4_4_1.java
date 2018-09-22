public class CheckPoint4_4_1
{
  public static void main(String[] args)
  {

    String s1 = "Welcome to Java";
    String s2 = "Programming is fun";
    String s3 = "Welcome to Java";

    System.out.println(s1 == s2); //false
    System.out.println(s2 == s3); //false
    System.out.println(s1 == s3); //surprisingly, true. Although the == operator checks for reference equality, and not content equality, the truth is, when Java encounters the same literal that was used a while back in the same code, Java reuses the same memory by creating a new reference in the same memory and assigning that reference to s3. This is how String pool allocation works in Java

    s1.equals(s2);  //false
    s1.equals(s3);  //true, since reference equality is checked for first
    s1.compareTo(s2); //7
    s2.compareTo(s3); //-7
    s2.compareTo(s2); //0

    System.out.println(s1.charAt(0)); //W
    System.out.println(s1.indexOf('j'));  //-1. This search is case sensitive
    System.out.println(s1.indexOf('j', -12)); //surprisingly, indexOf c
    System.out.println(s1.indexOf("to")); //8
    System.out.println(s1.lastIndexOf('a'));  //14
    System.out.println(s1.lastIndexOf('a', 16));  //should throw an error, since 15 is not in the zero-indexed range (15 is s1.length(), while the range is 0 -> s1.length() - 1)

    //does not throw an error
    System.out.println(s1.length());  //15
    System.out.println(s1.substring(5));  //"me to Java"
    System.out.println(s1.substring(5, 11));  //"me to ". Notice that the 11th character is not a part of the substring
    System.out.println(s1.startsWith("Wel")); //true
    System.out.println(s1.endsWith("Java"));  //true
    System.out.println(s1.toLowerCase()); //"welcome to java"
    System.out.println(s1.toUpperCase()); //"WELCOME TO JAVA"
    System.out.println(s1.concat(s2));  //"Welcome to JavaProgramming is fun"
    System.out.println(s1.contains(s2));   //false
    System.out.println("\t Wel \t".trim()); //"Wel"
  }
}
