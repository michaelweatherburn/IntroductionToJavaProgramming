public class MethodsInStringObjects
{
  public static void main(String[] args)
  {
    String fullName = "Subham Satyajeet";
    System.out.println(fullName.length());
    System.out.println(fullName.charAt(0));
    String wastedCharacters = "       Subham Satyajeet        ";
    System.out.println(wastedCharacters.trim());
    System.out.println(fullName.concat(" a.k.a. The Bro"));
    System.out.println(fullName.toUpperCase());
    System.out.println(fullName.toLowerCase());
  }
}
