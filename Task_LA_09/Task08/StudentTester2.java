package Task_LA_09.Task08;

public class StudentTester2
{
    public static void main(String[] args) {
        Student s1 = new Student("Naruto", "CSE");
        System.out.println("1----------------");
        s1.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s2 = new Student("Sakura", "BBA");
        System.out.println("2----------------");
        s2.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s3 = new Student("Shikamaru", "CSE");
        System.out.println("3----------------");
        s3.individualInfo();
        System.out.println("################");
        Student.totalInfo();
        System.out.println("==================");
        Student s4 = new Student("Deidara", "BBA");
        System.out.println("4----------------");
        s4.individualInfo();
        System.out.println("################");
        Student.totalInfo();
    }
}

class Student
{
    static int totalStudent = 0, cseStudent = 0, bbaStudent = 0;
    String name;
    String dep;
    int serial;

    Student(String name, String dep) {
        this.name = name;
        this.dep = dep;
        if(dep.equals("CSE")) {
            cseStudent += 1;
            serial = cseStudent;
        }
        if(dep.equals("BBA")) {
            bbaStudent += 1;
            serial = bbaStudent;
        }
        totalStudent += 1;
        System.out.println("Creating Student Number: " + totalStudent);
    }

    void individualInfo() {
        System.out.println(name + " if from " + dep + " department.");
        System.out.println("Serial of " + name + " among all students' is : " + totalStudent);
        System.out.println("Serial of " + name + " in " + dep + " department is : " + serial);
    }

    static void totalInfo() {
        System.out.println("Total Students: " + totalStudent);
        System.out.println("Total CSE Students: " + cseStudent);
        System.out.println("Total BBA Student: " + bbaStudent);
    }
}
