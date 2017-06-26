public class FormatDemo
{
  public static void main(String[] args)
  {
    System.out.printf("\n%-10s%-10s%-10s%-10s%-10s", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

    double degrees, radians;

    degrees = 0;
    radians = Math.toRadians(degrees);

    System.out.printf("\n%-10.4f%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    degrees = 30;
    radians = Math.toRadians(degrees);
    System.out.printf("\n%-10.4f%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    degrees = 45;
    radians = Math.toRadians(degrees);
    System.out.printf("\n%-10.4f%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    degrees = 60;
    radians = Math.toRadians(degrees);
    System.out.printf("\n%-10.4f%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    degrees = 90;
    radians = Math.toRadians(degrees);
    System.out.printf("\n%-10.4f%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
  }
}
