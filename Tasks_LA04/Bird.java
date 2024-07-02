package Tasks_LA04;

// TASK 8
public class Bird {
    public String name;
    public int x;

    public void flyUp(int n) 
    {
        System.out.println(name + " has flown up " + n + " feet.");
        x = n;
    }

    public void flyDown(int n) 
    {
        if (n == 1 || n == x) {
            System.out.println(name + " has flown down " + n + " feet and landed.");
        } else if (n < x) {
            System.out.println(name + " has flown down " + n + " feet.");
        } else if (x < n) {
            System.out.println(name + " cannot fly down " + n + " feet.");
        }
    }

    public void makeNoise() 
    {
        if (name.equals("Parrot")) {
            System.out.println("Squawk");
        }
        if (name.equals("Eagle")) {
            System.out.println("Squee");
        }
    }
}
