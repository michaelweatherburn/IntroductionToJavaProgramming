import java.util.Scanner;
public class IndexOfMethodInStringObject
{
  public static void main(String[] args)
  {
    /* the stringObject.indexOf() method can be used in four(!) different ways.

    Here's the four prototypes of the overloaded method:

    indexOf(char ch)
    This returns the first occurence of the character ch from the String. If a solution is found, indexOf returns a number between 0 and (stringObject.length() - 1). If no instance of the given string is found, the number -1 is returned.

    indexOf(char ch, int fromIndex)
    Similar to the first type, but starts search forward from the index provided by fromIndex, not from the index 0.

    indexOf(String s)
    This format searches for the occurence of a substring inside the current string.

    indexOf(String s, int fromIndex)
    This format, analogous to the second one, searches for a substring, forward from the index fromIndex.
    */

    String greeting = "hey there!";
    System.out.println(greeting.indexOf('!'));  // 9
    System.out.println(greeting.indexOf('!', 5));
    System.out.println(greeting.indexOf('h'));  // 0
    System.out.println(greeting.indexOf('h', 0)); // 0. Notice that the fromIndex is also considered when counting forward from it.
    System.out.println(greeting.indexOf('h', 1)); //now that the second character 'e' is the symbol we're counting forward from, the first character 'h' is not processed.
    System.out.println(greeting.indexOf("there"));  // 4. Notice that the first index of the substring is returned on the index match
    System.out.println(greeting.indexOf("re")); // 7
    System.out.println(greeting.indexOf("he"));   // 0
    System.out.println(greeting.indexOf("he", 1));  //notice that counting from 1, the 'h' in the first occurence of substring "he" is not visible to the program, hence the second instance is considered.

    String s1 = "Welcome to Java";
    System.out.println(s1.indexOf('W'));  //0
    System.out.println(s1.indexOf('o'));  //4
    System.out.println(s1.indexOf('o', 5)); //9
    System.out.println(s1.indexOf("come")); //3
    System.out.println(s1.indexOf("Java", 5));  //-1
    System.out.println(s1.indexOf("Java")); //11

  }
}
