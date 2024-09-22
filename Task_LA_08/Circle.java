package Task_LA_08;

// TASK 06
class Circle extends Shape
{
    public double radius;
    public double area;

    public void area()
    {
        double pi = 3.1416;
        area = pi * radius * radius;
        System.out.println("Area of " + color + " " + name + ": " + area);
    }
}