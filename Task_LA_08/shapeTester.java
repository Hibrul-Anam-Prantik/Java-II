package Task_LA_08;

public class shapeTester {
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

class Shape {
  public String name;
  public String color;

  public void displayInfo() {
    System.out.printf("Name: %s\nColor: %s\n", name, color);
  }
}

class Circle extends Shape {
  public double radius;
  public double area;
  
  public void area() {
    area = radius * radius * 3.14;
    System.out.println("Area of " + color + " " + name + ": " + area);
  }
}
