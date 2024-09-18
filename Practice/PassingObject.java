package Practice;
 
public class PassingObject {
    public static void main(String[] args) {
        Pass a = new Pass();
        a.setName(); a.setId();
        System.out.println("==========================");
        a.printInfo();
        System.out.println("==========================");
        Pass b = new Pass();
        a.name = "Alex";
        a.id = "A104";
        a.printInfo();
        System.out.println("==========================");
        b.name = "Bob";
        b.id = "B104";
        b.printInfo();
        System.out.println("==========================");
        b.setNameId(a);
        System.out.println("==========================");
        b.printInfo();
        System.out.println("==========================");
        a.printInfo();
    }
}

class Pass 
{
    String name;
    String id;

    void setName() {
        name = "Set Name";
    }

    String getName() {
        return name;
    }

    void setId() {
        id = "Set ID";
    }

    String getId() {
        return id;
    }

    void printInfo() {
        System.out.println("Name: " + name + "\nID  : " + id);
    }

    void setNameId (Pass obj) {
        System.out.println(this.name + " | " + this.id);
        this.name = obj.name;
        System.out.println("Name changed to: " + this.name);
        this.id = obj.id;
        System.out.println("ID changed to  : " + this.id);
        System.out.println(obj.name);
        System.out.println(this.name);
    }
}
