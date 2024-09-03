public class CourseTester{
     public static void main(String [] args){
          Course c1 = new Course();
          c1.createCourse("PL II", "CS11");
          System.out.println("----------------");
          c1.printDetails();
          System.out.println("----------------");
          c1.addOneContent("Overloading");
          c1.printDetails();
          System.out.println("----------------");
          c1.addOneContent("Encapsulation");
          c1.addTwoContent("Static", "Polymorphism");
          c1.printDetails();
          System.out.println("----------------");
          c1.addOneContent("Inheritance");
          System.out.println("----------------");
          Course c2 = new Course();
          c2.createCourse("DS", "CS22");
          c2.addOneContent("Stack");
          c2.addTwoContent("Recursion","Tree");
          c2.addTwoContent("Heap","Hashing");
          System.out.println("----------------");
          c2.printDetails();
     }
}
