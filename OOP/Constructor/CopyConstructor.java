package OOP.Constructor;

public class CopyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.marks[0] = 80; s1.marks[1] = 90; s1.marks[2] = 100;
        Students s2 = new Students(s1);
        System.out.println("Name: " + s2.name +"\nId  : " + s2.id);
        System.out.println("Marks: ");
        for(int i = 0; i < s2.marks.length; i++) 
        {
            System.out.println("       " + s2.marks[i]);
        }
        s1.marks[0] = 100;
        System.out.println("Marks: ");
        for(int i = 0; i < s2.marks.length; i++) 
        {
            System.out.println("       " + s2.marks[i]);
        }
    }
}

class Students 
{
    String name;
    int id;
    int[] marks = new int[3];
    Students() 
    {
        System.out.print("Name : ");
        name = "SCD";
        System.out.println(name);
        id = 20121030;
        System.out.print("ID   : "); 
        System.out.println(id);
        System.out.println("Marks: ");
        for(int i = 0; i < marks.length; i++) 
        {
            System.out.println("       " + marks[i]);
        }
    }

// Shallow-Copy Constructor
    // Students(Students s1) 
    // {     
    //     System.out.println("Copy Constructor is called...");
    //     this.name = s1.name;
    //     id = s1.id;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }
// Deep-Copy Constructor
    Students (Students s1) 
    {
        this.name = s1.name;
        this.id = s1.id;
        marks = new int[3];
        for(int i = 0; i < marks.length; i++) 
        {
            this.marks[i] = s1.marks[i];
        }
    }
}
