public class CheckPoint4_24
{
  public static void main(String[] args)
  {
    System.out.printf("\namount is %f %e", 32.32, 32.32);
    //32.3200000 3.232000e+01

    System.out.printf("\namount is %5.2f%% %5.4e", 32.327, 32.32);
    // 32.33 3.2320e+01

    System.out.printf("\n%6b", (1 > 2));
    //<blank-space>false

    System.out.printf("\n%6s", "Java");
    //<blank-space><blank-space>Java

    System.out.printf("\n%-6b%s", (1 > 2), "Java");
    //false<blank-space>Java

    System.out.printf("\n%6b%-8s", (1 > 2), "Java");
    //<blank-space>falseJava<blank-space><blank-space><blank-space><blank-space>
  }
}
