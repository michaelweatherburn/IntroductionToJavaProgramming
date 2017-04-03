import java.util.Scanner;

public class Question7
{

  public static int setSignum(int count){
    return (count % 2 == 0 ? -1 : +1);
  }

  public static void main(String[] args){
    //creating scannerObject
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter the number of terms until which the series is to be calculated. ");
    int n = scannerObject.nextInt();
    double sum = 0;
    double answer;

    for(int i = 1; i <= n; i++){
      sum = sum + ( (double) setSignum(i) / (double) (2 * i - 1));
    }
    answer = sum * 4;

    System.out.println("Required sum: " + answer);
  }
}
