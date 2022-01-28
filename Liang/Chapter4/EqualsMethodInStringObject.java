import java.util.Scanner;

public class ComparisionMethodsInStringObject
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String s1 = "Subham";
    String s2 = "Subham";
    System.out.println("Enter the name of the second String. ");
    String s3 = scanner.next();

    /* Notice that? string reference comparision is extremely unhelpful, as it can only take you so far. To actually work with strings, you will have to use the equals() method. This method employs two halves:

    1) If the two strings are the same object (i.e. point to the same object in memory), then their contents cannot be different.
    But if they're unequal, step 2:
    2) Create character arrays out of the Strings and compare character-by-character in constant time to find whether the Strings are equal.

    Hence, the equals method is more thorough, as it incorporates the checking of references. This method is always more preferable, as shown in the code below */

    if(s1 == s2)
    {
      System.out.println("s1 and s2, the two string literals, are the same object in memory. ");
    }

    if(s1.equals(s2))
    {
      System.out.println("s1 and s2, the two string literals, are either the same object in memory, or are logically the same. ");
    }

    if(s1 == s3)
    {
      System.out.println("s1 and s2, one a string literals, another a String variable that gets memory at runtime, are the same object. ");
    }

    if(s1.equals(s3))
    {
      System.out.println("s1 and s2, one a string literals, another a String variable that gets memory at runtime, are either the same object in memory, or are logically same. ");
    }

    /* See? Memory allocations of String literals happen in the String pool. Memory allocations of any object that happens at runtime, is stored in the heap. Since s1 and s2 are both from the String pool, the Java compiler optimises memory usage by creating one memory area for both references.

    This checking whether String literals are having the same value and clubbing them together as one object, happens only for String literals (since string literals of a particular program are stored inside a special area called the String pool).

    When any object is allocated memory at runtime, that memory is present in heap, where optimisation rules don't apply. Hence an object from String Pool and an object from Heap cannot have the same reference. That is why the == method (which simply checks whether two references are pointing to the same memory location) fails while equals() (which checks for content-equality IF reference equality fails) works.

    */
  }
}
