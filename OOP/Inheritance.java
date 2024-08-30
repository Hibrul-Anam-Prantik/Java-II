package OOP;

public class Inheritance 
{
    public static void main(String[] args) 
    {
        Fish shark = new Fish();
        shark.setColor();
        System.out.println("Color: " + shark.color);
        shark.eat();
        shark.breath();
    }
}

// Base Class
class Animal 
{
    String color;

    void eat() 
    {
        System.out.println("Eats");
    }

    void breath() 
    {
        System.out.println("Breathes");
    }  
}

// Derived Class
class Fish extends Animal 
{
    int fins;

    void swim() 
    {
        System.out.println("Swims in Water");
    }
    void setColor() 
    {
        color = "Gray";
    }
}
