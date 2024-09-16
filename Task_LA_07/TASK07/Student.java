package TASK07;
public class Student {
    private double cg;
    private String courses[];
    private int id;
    private int courseCount;
    private int idx;    // index for adding courses to the array
    
    public Student(int id) {
        this.id = id;
        courses = new String[4];
    }

    public Student(int id, double cg) {
        this.id = id; this.cg = cg;
        courses = new String[4];
    }
    
    public void addCourse(String course) {
        if(cg == 0) {
            System.out.println("Failed to add " + course + "\nSet CG first");
        } else {
            if(courseCount >= 3 && cg < 3) {
                System.out.println("Failed to add " + course);
                System.out.println("CG is low. Can't add more than 3 courses.");
            } else {
                courses[idx++] = course;
                courseCount ++;
            }
        }
    }

    public void setCG(double cg) {
        this.cg = cg;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cg);
        if(courseCount == 0) {
            System.out.println("No courses added.");
        } else {  
            System.out.println("Added courses are:");
            for(int i = 0; i < courseCount; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }

    public void rmAllCourse() {
        courseCount = 0; idx = 0;
        courses = new String[4];
    }

    public void setID(int id) {
        this.id = id;
    }

    public void addCourse(String[] courses) {
        for(int i = 0; i < courses.length; i++) {
            if(cg < 3) {
                if(courseCount == 3) {
                    System.out.println("Failed to add " + courses[i]);
                    System.out.println("CG is low. Can't add more than 3 courses.");
                    break;
                } else {
                    this.courses[idx++] = courses[i];
                    courseCount ++;
                }
            } else {
                if(courseCount == 4) {
                    System.out.println("Failed to add " + courses[i] + "\nMaximum 4 courses allowed.");
                    break;
                } else {
                    this.courses[idx++] = courses[i];
                    courseCount ++;
                }
            }
        }
    }
}
