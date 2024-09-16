public class Shape2DTester {
  public static void main(String[] args) {
    Shape2D sq = new Shape2D(5);
    System.out.println("---------1----------");
    sq.area();
    System.out.println("---------2----------");
    Shape2D rectangle = new Shape2D(5, 6);
    System.out.println("---------3----------");
    rectangle.area();
    System.out.println("---------4----------");
    Shape2D tri1 = new Shape2D(5, 6, "Triangle");
    System.out.println("---------5----------");
    tri1.area();
    System.out.println("---------6----------");
    Shape2D tri2 = new Shape2D(5, 6, 7);
    System.out.println("---------7----------");
    tri2.area();
    System.out.println("---------8----------");
  }
}

// class Shape2D {
// public String shape;
// public double area;

// public Shape2D(int length) {
// shape = "Square";
// System.out.println("A " + shape + " has been created with length: " +
// length);
// area = length * length;
// }

// public Shape2D(int length, int breadth) {
// shape = "Rectangle";
// System.out.println("A " + shape + " has been created with length: " + length
// + " and breadth: " + breadth);
// area = length * breadth;
// }

// public Shape2D(int height, int base, String shape) {
// this.shape = shape;
// System.out.println("A " + shape + " has been created with height: " + height
// + " and base: " + base);
// area = 0.5 * (base * height);
// }

// boolean sides; /*
// * I will this flag to determine whether the triangle has sides or not,
// * if the triangle has sides I will use the "printf" to print the area.
// */

// public Shape2D(int a, int b, int c) {
// sides = true;
// shape = "Triangle";
// System.out.println("A " + shape + " has been created withthe following sides:
// " + a + ", " + b + ", " + c);
// double s = 0.5 * (a + b + c); // halfPerimeter
// double x = s * (s - a) * (s - b) * (s - c);
// area = Math.sqrt(x);

// // area = Math.pow(x, 0.5);
// }

// public void area() {
// // if (sides) {
// // System.out.printf("The area of the " + shape + " is: %.02f", area);
// // System.out.println();
// // } else {
// System.out.println("The area of the " + shape + " is: " + area);
// // }
// }
// }
