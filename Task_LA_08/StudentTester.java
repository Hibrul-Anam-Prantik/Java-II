package Task_LA_08;

// TASK 03
public class StudentTester {
  public static void main(String[] args) {
    Student.printDetails();
    System.out.println("--------------------");
    Student mikasa = new Student("Mikasa", 3.75);
    mikasa.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
    System.out.println("--------------------");
    Student harry = Student.createStudent("Harry", 2.5, "Charms");
    harry.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
    System.out.println("--------------------");
    Student levi = new Student("Levi", 3.33);
    levi.individualDetail();
    System.out.println("--------------------");
    Student.printDetails();
  }
}

// Another Way

// class Student {
//  public static int id;
//  public String name;
//  public double cg;
//  public String dep;
//  public static int cseStudents;
//
//  public static void printDetails() {
//    System.out.println("Total Student(s): " + id);
//    System.out.println("CSE Student(s): " + cseStudents);
//    System.out.println("Other Department Student(s): " + (id - cseStudents));
//  }
//
//  public Student(String name, double cg) {
//    this.name = name;
//    this.cg = cg;
//    dep = "CSE";
//    id++;
//    cseStudents++;
//  }
//
//  public Student(String name, double cg, String dep) {
//    this.name = name;
//    this.cg = cg;
//    this.dep = dep;
//    id++;
//  }
//
//  public void individualDetail() {
//    System.out.println("ID: " + id);
//    System.out.println("Name: " + name);
//    System.out.println("CGPA: " + cg);
//    System.out.println("Department: " + dep);
//  }
//
//  public static Student createStudent(String name, double cg, String dep) {
//    Student tempStudent = new Student(name, cg);
//    tempStudent.dep = dep;
//    return tempStudent;
//  }
//}
