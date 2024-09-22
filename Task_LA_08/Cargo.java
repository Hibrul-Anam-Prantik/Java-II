package Task_LA_08;

// TASK 05
public class Cargo
{
    public static double capacity = 10;
    public String content;
    public double weight;
    public boolean load;
    public static int idTracker;
    public int id;

    public Cargo(String content, double weight)
    {
        this.content = content;
        this.weight = weight;
        id = ++ idTracker;
    }

    public void details()
    {
        System.out.println("Cargo ID: " + id + ", Contents: " + content + ", Weight: " + weight + ", Loaded: " + load);
    }

    public static double capacity()
    {
        return capacity;
    }

    public void load()
    {
        if(weight <= capacity) {
            load = true;
            capacity -= weight;
            System.out.println("Cargo " + id + " loaded for transport.");
        } else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload()
    {
        load = false;
        capacity += weight;
        System.out.println("Cargo " + id + " unloaded.");
    }
}
