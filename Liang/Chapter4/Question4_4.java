import java.util.Scanner;
public class Question4_4
 {
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the side: ");
     double side = scanner.nextDouble();
     double areaOfHexagon = (6 * Math.pow(side, 2))/(4 * Math.tan(Math.PI / 6));
     //double areaOfHexagon = 1.5 * Math.sqrt(3.0) * Math.pow(side, 2);

     System.out.printf("The area of the hexagon is %.2f", areaOfHexagon);
   }
 }
