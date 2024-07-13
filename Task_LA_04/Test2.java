package Task_LA_04;

// TASK 2
public class Test2 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.println("Radius of the circle is " + cr.radius);
        double pi = Math.PI;
        System.out.println("The area of the circle is " + (pi * cr.radius * cr.radius));
        System.out.println("The circumference of the circle is " + (2 * pi * cr.radius));
    }
}
