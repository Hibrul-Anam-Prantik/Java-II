package Task_LA_06;

// TASK 07
/*   The Difference between Task 6  & Task 7 is that, in Task 7, 
     we face the term Method over loading for the "addContent()" method; 
     one has a single parameter & another one has two parameters.
*/
public class Course2 
{
     public String courseName;
     public String courseCode;
     public String[] syllabus;
     public int contents;
     int index = 0; // To access the index of the syllabus[] array

     public void createCourse(String name, String code) 
     {
          courseName = name;
          courseCode = code;
          syllabus = new String[4];
     }

     public void printDetails() 
     {
          System.out.println("Course details:");
          System.out.println("Course Name: " + courseName);
          System.out.println("Course Code: " + courseCode);
          System.out.println("Course Syllabus:");
          if (contents > 0) {
               if (contents == 1) { // if one content, then "," won't be used
                    System.out.print(syllabus[0]);
                    System.out.println();
               } else { // handling ","
                    for (int i = 0; i < contents - 1; i++) {

                         System.out.print(syllabus[i] + ", ");
                    }
                    System.out.println(syllabus[contents - 1]);
               }
          } else {
               System.out.println("No content yet.");
          }
     }

     public void addContent(String syllabus) 
     {
          if ((contents + 1) <= 4) { // 4 = max contents of syllabus
               this.syllabus[index++] = syllabus;
               System.out.println(syllabus + " was added.");
               contents++;
          } else {
               System.out.println("Cannot add more content");
          }
     }

     public void addContent(String s1, String s2) 
     {
          if ((contents+1) <= 4){
               this.syllabus[index ++] = s1;
               System.out.println(s1 + " was added.");
               contents ++;
          }
          if ((contents+1) <= 4){
               this.syllabus[index ++] = s2;
               System.out.println(s2 + " was added.");
               contents ++;     
          } else {
               System.out.println("Cannot add more content");
          }
     }
}