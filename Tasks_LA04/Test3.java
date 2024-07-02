package Tasks_LA04;

public class Test3 
{
    public static void main(String [] args){
        Circle cr = new Circle();
        System.out.println("Radius of the circle is "+ cr.radius); 
        double pi = 3.1416d;
        System.out.println("The area of the circle is "+ pi*cr.radius*cr.radius);
        System.out.println("The circumference of the circle is "+ 2*pi*cr.radius);
    }    
}
