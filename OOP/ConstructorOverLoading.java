package OOP;

public class ConstructorOverLoading {
    public static void main(String[] args) {
        OverLoading l1 = new OverLoading();
        System.out.println("Age : " + l1.age);
        System.out.println();
        OverLoading l2 = new OverLoading("Luffy");
        System.out.println("Age : " + l2.age);
        System.out.println();
        OverLoading l3 = new OverLoading("Zoro", 21);
        System.out.println("Age : " + l3.age);
        System.out.println();
    }
}

class OverLoading 
{
    String name;
    int age;

    OverLoading ()     // Non-Parameterized Constructor
    {
        System.out.println("Non-Parameterized Constructor is called...");
        name = "Prantik";
        age = 20;
        System.out.println("Name: " + name);
    }

    OverLoading (String name)     // Parameterized Constructor
    {
        System.out.println("Parameterized Constructor is called...");
        this.name = name;
        age = 19;
        System.out.println("Name: " + name);
    }

    OverLoading (String name, int age)      // Parameterized Constructor
    {
        System.out.println("Parameterized Constructor is called...");
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
    }
}
