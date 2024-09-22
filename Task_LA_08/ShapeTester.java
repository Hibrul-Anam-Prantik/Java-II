package Task_LA_08;

public class ShapeTester {
  public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println("=======================");
    c.name = "Circle";
    c.color = "Red";
    c.radius = 5;
    c.displayInfo();
    System.out.println("=======================");
    c.area();
  }
}