public class CheckPoint3_7_2
{
  public static void main(String[] args)
  {
    System.out.println((int)(Math.random() * 20));
    System.out.println((int)(Math.random() * 10) + 10);
    System.out.println((int)(Math.random() * 40) + 10);
    System.out.println(Math.random() > 0.5);  //an expression that returns true or false, randomly
    if(Math.random() > 0.5){
      System.out.print("1");
    }
    else{
      System.out.print("0");
    }
  }
}
