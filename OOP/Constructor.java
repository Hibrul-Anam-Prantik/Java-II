package OOP;

public class Constructor 
{
    public static void main(String[] args) 
    {
        NewCon nc = new NewCon();
        System.out.println("Age: " + nc.age);
    }
}

class NewCon 
{
    String name;
    int age;
    // Constructors don't have any return type, they're not even void type
    NewCon() 
    { 
        System.out.println("Constructor is called...");
        this.name = "Prantik";
        age = 20;
        System.out.println("Name: " + name);
    }
}
