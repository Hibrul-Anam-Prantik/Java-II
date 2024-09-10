package Practice;

public class CourseTester{
    public static void main(String [] args){
      Course c1 = new Course();
      c1.createCourse("PL II", "CS11");
      System.out.println("--------1--------");
      c1.printDetails();
      System.out.println("--------2--------");
      c1.addOneContent("Overloading");
      c1.printDetails();
      System.out.println("--------3--------");
      c1.addOneContent("Encapsulation");
      c1.addTwoContent("Static", "Polymorphism");
      c1.printDetails();
      System.out.println("--------4--------");
      c1.addOneContent("Inheritance");
      System.out.println("--------5--------");
      Course c2 = new Course();
      c2.createCourse("DS", "CS22");
      c2.addOneContent("Stack");
      c2.addTwoContent("Recursion","Tree");
      c2.addTwoContent("Heap","Hashing");
      System.out.println("--------6--------");
      c2.printDetails();
    }
  }
  

class Course 
{
    public String[] syllabus = new String[4];
    public String name;
    public String code;
    // int count = 0;
    int i = 0;
    int count2 = 0;  // syllabus content
    public void createCourse(String name, String code) {
        this.name = name;
        this.code = code;
        // count ++;
    }
    public void printDetails() {
        System.out.println("Course details:\nCourse Name: " + name + "\nCourse Code: " + code + "\nCourse Syllabus: ");
        if (count2 == 0) {
            System.out.println("No content yet.");
        } else {
            for(int i = 0; i < count2; i++) {
                if(i == (count2 - 1)) {
                    System.out.println(syllabus[i]);
                } else {
                    System.out.print(syllabus[i] + ", ");
                }
            }
        }
    }
    public void addOneContent(String c1) {
        if(i < 4) {
            syllabus[i++] = c1;
            System.out.println(c1 + " was added.");
            count2 ++;
        } else {
            System.out.println("Cannot add more content");
        }
    }
    public void addTwoContent(String c1, String c2) {
        if(count2 < 4) {
            syllabus[i++] = c1;
            count2 ++;
            System.out.println(c1 + " was added.");
        }
        if(count2 < 4) {
            syllabus[i++] = c2;
            count2++;
            System.out.println(c2 + " was added.");
        } else {
            System.out.println("Cannot add more content");
        }
    }
}
