package Task_LA_06;

// TASK 06
public class Course 
{
     public String courseName;
     public String courseCode;
     public String[] syllabus;
     public int contents;
     int index = 0;     // To access the index of the syllabus[] array
     
     public void createCourse(String name, String code) {
          courseName = name;
          courseCode = code;
          syllabus = new String[4];
     }
     public void printDetails() {
          System.out.println("Course details:");
          System.out.println("Course Name: " + courseName);
          System.out.println("Course Code: " + courseCode);
          System.out.println("Course Syllabus:");
          if(contents > 0) {
               if(contents == 1) {
                    System.out.print(syllabus[0]);
                    System.out.println();
               } else {
                    for(int i = 0; i < contents - 1; i++) {
                         
                         System.out.print(syllabus[i] + ", ");
                    }
                    System.out.println(syllabus[contents - 1]);
               }
          } else {
               System.out.println("No content yet.");
          }
     }
     
     public void addOneContent(String syllabus) {
          
          if ((contents + 1) <= 4){
               this.syllabus[index ++] = syllabus;
               System.out.println(syllabus + " was added.");
               contents ++;
          } else {
               System.out.println("Cannot add more content");
          }
     }
     
     public void addTwoContent(String s1, String s2) {
          if ((contents+1) <= 4){
               this.syllabus[index ++] = s1;
               System.out.println(s1 + " was added.");
               contents ++;
          }
          if ((contents+1) <= 4){
               this.syllabus[index ++] = s2;
               System.out.println(s2 + " was added.");
               contents ++;
               
          }  
     }
}