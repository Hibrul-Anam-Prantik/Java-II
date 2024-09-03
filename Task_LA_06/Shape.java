// TASK 08
public class Shape
{
     public double area;
     public String shape;
     
     public void setParameters(String shape, double radius) {
          double pi = 3.1416;
          area = pi * radius * radius;
          this.shape = shape;
     }
     
     public void setParameters(String shape, double base, double height) {
          this.shape = shape;
          area = 0.5 * base * height;
     }
     
     public void setParameters(String shape, double base1, double base2, double distance) {
          this.shape = shape;
          area = 0.5 * (base1 + base2) *distance;
     }
     
     public double details() {
          System.out.println("Shape Name: " + shape);
          System.out.print("Area: ");
          return area;
     }
}