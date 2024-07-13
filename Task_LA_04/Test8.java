package Task_LA_04;

// TASK 8
public class Test8 
{
    public static void main(String args[]) 
    {
        Bird parrot = new Bird();
        parrot.name = "Parrot";
        parrot.flyUp(3);
        parrot.makeNoise();
        parrot.flyDown(5);
        parrot.flyDown(2);
        parrot.flyDown(1);
        Bird eagle = new Bird();
        eagle.name = "Eagle";
        eagle.flyUp(5);
        eagle.flyDown(5);
        eagle.makeNoise();
    }
}