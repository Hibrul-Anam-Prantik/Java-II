package OOP;

public class Inheritance_SingleLevel {
    public static void main(String[] args) {
        Man m1 = new Man();
        m1.occupation();
    }
}

// Base Class
class Human {
    String skinTone;
    int age;
    void maritalStatus() 
    {
        System.out.println("Sealed");
    }
    void occupation() 
    {
        System.out.println("Eat Sleep Repeat!");
    }
    void eat() 
    {
        System.out.println("Eats");
    }
}

// Derived Class / Sub Class
class Man extends Human {
    void sex() 
    {
        System.out.println("Male");
    }
}
