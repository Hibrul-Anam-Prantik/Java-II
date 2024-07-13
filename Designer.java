import java.util.*;

public class Designer {
    public String name;
    public String color;

    public void changeName(String name) 
    {
        this.name = name;
    }

    public String bark() 
    {
        if (name != null && color == null) {
            return name + " is barking";
        } else if (color != null && name == null) {
            return color + " dog is barking";
        } else if (color == null && name == null) {
            return "A dog is barking";
        }
        return name + " the " + color + " dog is barking";
        
    }

    public void changeColor(String color) 
    {
        this.color = color;
        if (name == null) {
            System.out.println("This dog is " + color);
        } else {
            System.out.println(name + " is " + color);
        }
    }
}