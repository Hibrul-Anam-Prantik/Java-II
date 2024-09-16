public class Rough {
    public static void main(String[] args) {
        // Shape2D sq = new Shape2D(5);
        // System.out.println("---------1----------");
        // sq.area();
        // System.out.println("---------2----------");
        // Shape2D rectangle = new Shape2D(5, 6);
        // System.out.println("---------3----------");
        // rectangle.area();
        // System.out.println("---------4----------");
        // Shape2D tri1 = new Shape2D(5, 6, "Triangle");
        // System.out.println("---------5----------");
        // tri1.area();
        // System.out.println("---------6----------");
        // Shape2D tri2 = new Shape2D(5, 6, 7);
        // System.out.println("---------7----------");
        // tri2.area();
        // System.out.println("---------8----------");
        double d = 17.696943;
        String s = "";
        s += d;
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                idx = i;
            }
            System.out.print(s.charAt(i));
            if(i == idx+2) {
                break;
            }
        }
    }
}

class Shape2D {
    public int length;
    public int breadth;
    public int height;
    public int base;
    public int side1;
    public int side2;
    public int side3;
    public boolean square;
    public boolean rectangle;
    public boolean triangle;
    public boolean triangle1;
    public double area;
    public double s;

    public Shape2D(int a) {
        length = a;
        square = true;
        System.out.println("A Square has been created with length: " + a);
    }

    public Shape2D(int a, int b) {
        length = a;
        breadth = b;
        rectangle = true;
        System.out.println("A Rectangle has been created with length: " + a + " and breadth: " + b);
    }

    public Shape2D(int a, int b, int c) {
        side1 = a;
        side2 = b;
        side3 = c;
        triangle = true;
        s = (side1 + side2 + side3) / 2;
        System.out.println("A Triangle has been created with the following sides: " + a + "," + b + "," + c);
    }

    public Shape2D(int a, int b, String c) {
        height = a;
        base = b;
        if (c.equals("Triangle")) {
            triangle1 = true;
        }
        System.out.println("A " + c + " has been created with height: " + a + " and base: " + b);
    }

    public void area() {
        if (square) {
            area = length * length;
            System.out.println(area);
        }
        if (rectangle) {
            area = length * breadth;
            System.out.println(area);
        }
        if (triangle) {
            area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
            System.out.println(area);
        }
        if (triangle1) {
            area = .5 * height * base;
            System.out.println(area);
        }
    }

}