package Task_LA_09;

//Tester Class
public class TestStudent{
    public static void main(String [] args){
        BBAStudent b1 = new BBAStudent();
        BBAStudent b2 = new BBAStudent("Humty Dumty");
        BBAStudent b3 = new BBAStudent("Little Bo Peep");
        b1.details();
        System.out.println("1---------------");
        b2.details();
        System.out.println("2---------------");
        b3.details();
    }
}

class Student{
    private String name = "Just a Student";
    private String department = "nothing";

    public void updateDepartment(String dpt){
        this.department = dpt;
    }
    public void updateName(String name){
        this.name = name;
    }
    public void details(){
        System.out.println("Name : " + name + " Department: " + department);
    }
}

// TASK 01
class BBAStudent extends Student
{
    public BBAStudent() {
        updateName("Default");
        updateDepartment("BBA");
    }

    public BBAStudent(String name) {
        updateName(name);
        updateDepartment("BBA");
    }
}



