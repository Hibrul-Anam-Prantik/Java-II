package Task_LA_07;

public class StudentTester{
   public static void main(String[] args){
       Student s1 = new Student("Harry", "CSE");
       System.out.println(s1.name);
       s1.updateName("Harry Potter");
       System.out.println(s1.accessName());
       System.out.println(s1.prog);
       s1.updateProgram("CS");
       String prog = s1.accessProgram();
       System.out.println(prog);
   }
}
// 1, 3, 6
// class Student 
// {
//     public String name;
//     public String prog;

//     public Student(String name, String prog) {
//         this.name = name;
//         this.prog = prog;
//     }

//     public void updateName(String update) {
//         name = update;
//     }

//     public String accessName() {
//         return name;    
//     }

//     public void updateProgram(String update) {
//         prog = update;
//     }

//     public String accessProgram() {
//         return prog;
//     }
// }