public class CourseTester2{
     public static void main(String [] args){
          Course2 c1 = new Course2();
          c1.createCourse("PL II", "CS11");
          System.out.println("----------------");
          c1.printDetails();
          System.out.println("----------------");
          c1.addContent("Overloading");
          c1.printDetails();
          System.out.println("----------------");
          c1.addContent("Encapsulation");
          c1.addContent("Static", "Polymorphism");
          c1.printDetails();
          System.out.println("----------------");
          c1.addContent("Inheritance");
          System.out.println("----------------");
          Course2 c2 = new Course2();
          c2.createCourse("DS", "CS22");
          c2.addContent("Stack");
          c2.addContent("Recursion","Tree");
          c2.addContent("Heap","Hashing");
          System.out.println("----------------");
          c2.printDetails();
     }
}
