package Task_LA_05;

public class Course {
    public String cName;
    public String code;
    public int credit;

    public void createCourse(String cName, String code, int credit) 
    {
        this.cName = cName;
        this.code = code;
        this.credit = credit;
    }

    public void displayCourse() 
    {
        System.out.println("Course Name: " + cName);
        System.out.println("Course Code: " + code);
        System.out.println("Course Credit: " + credit);
    }
    public void updateCourse(String cName, String code, int credit) 
    {
        this.cName = cName;
        this.code = code;
        this.credit = credit;
    }
}
