public class Shape2D {
  public String shape;
  public double area;

  public Shape2D(int length) {
    shape = "Square";
    System.out.println("A " + shape + "  has been created with length: " + length);
    area = length * length;
  }

  public Shape2D(int length, int breadth) {
    shape = "Rectangle";
    System.out.println("A " + shape + "  has been created with length: " + length + " and breadth: " + breadth);
    area = length * breadth;
  }

  public Shape2D(int height, int base, String shape) {
    this.shape = shape;
    System.out.println("A " + shape + "  has been created with height: " + height + " and base: " + base);
    area = 0.5 * (base * height);
  }

  public Shape2D(int a, int b, int c) {
    shape = "Triangle";
    System.out.println("A " + shape + "  has been created with the following sides: " + a + ", " + b + ", " + c);
    double s = 0.5 * (a + b + c); // halfPerimeter
    double x = s * (s - a) * (s - b) * (s - c);
    area = Math.sqrt(x);
  }

  public void area() { 
    System.out.println("The area of the " + shape + " is: " + area); 
  }
}