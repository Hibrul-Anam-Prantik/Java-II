package Task_LA_07;

public class Student
{
    public String name;
    public String prog;

    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    public void updateName(String update) {
        name = update;
    }

    public String accessName() {
        return name;    
    }

    public void updateProgram(String update) {
        prog = update;
    }

    public String accessProgram() {
        return prog;
    }
}