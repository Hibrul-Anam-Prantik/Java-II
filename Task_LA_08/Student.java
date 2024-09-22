package Task_LA_08;

// TASK 03
public class Student
{
    public static int totalStudents;
    public static int cseStudents;
    public static int otherDepartmentStudents;
    public String name;
    public String department = "CSE";
    public int id;
    public static int traceID; // for recording the ID numbers
    public double cg;

    public Student(String name, double cg)
    {
        this.name = name;
        this.cg = cg;
        id = ++traceID;
        cseStudents ++;
        totalStudents ++;
    }

    public Student(String name, double cg, String department)
    {
        this.name = name;
        this.cg = cg;
        this.department = department;
        id = ++traceID;
        totalStudents ++;
        otherDepartmentStudents ++;
    }

    public static void printDetails()
    {
        System.out.println("Total Student(s): " + totalStudents);
        System.out.println("CSE Student(s): " + cseStudents);
        System.out.println("Other Department Student(s): " + otherDepartmentStudents);
    }

    public void individualDetail()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cg);
        System.out.println("Department: " + department);
    }

    public static Student createStudent(String setName, double setCg, String setDepartment)
    {
        return new Student(setName, setCg, setDepartment);  // returning object of Student class
    }
}
