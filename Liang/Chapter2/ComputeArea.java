public class ComputeArea
{
  public static void main(String[] args)
  {
    //step 0: create (declare) all variables
    double radius;
    double area;

    //step 1: read in radius
    radius = 20;

    //compute area
    area = radius * radius * 3.14159;

    //step 3: display the area
    System.out.println("The are for the circle of radius " + radius + " is " + area);
  }
}
