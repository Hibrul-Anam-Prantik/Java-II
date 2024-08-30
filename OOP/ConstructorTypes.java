package OOP;

public class ConstructorTypes 
{
    public static void main(String[] args) 
    {
        Teacher t1 = new Teacher(); // Non-Parameterized Constructor
        System.out.println("Name: " + t1.name +"\nId  : " + t1.id);
        System.out.println();
        Stuff st = new Stuff("Ussop"); // Parameterized Constructor
        System.out.println("Name: " + st.name +"\nId  : " + st.id);
        System.out.println();
        Teacher t2 = new Teacher(t1); // Copy Constructor
        System.out.println("Name: " + t2.name +"\nId  : " + t2.id);
    }
}

class Teacher 
{
    String name;
    int id;

    Teacher()   // Non-Parameterized Constructor
    {
        System.out.println("Non-Parameterized Constructor is called...");
        name = "SCD";
        id = 20121030;
    }

    Teacher(Teacher t1) // Copy Constructor
    {     
        System.out.println("Copy Constructor is called...");
        this.name = t1.name;
        id = t1.id;
    }
}

class Stuff 
{
    String name;
    int id;

    Stuff(String name) // Parameterized Constructor
    {
        System.out.println("Parameterized Constructor is called...");
        this.name = name;
        id = 03;
    }
}
