package Task_LA_05;

public class MagicItem 
{
    public String name;
    public int level;
    public String item1;
    public String item2;
    public String item3;
    public void newCharacter(String name)
    {
        this.name = name;
    }
    public void displayInfo()
    {
        System.out.println("Character Name: " + name);
        System.out.println("Energy Level: " + level);
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
        System.out.println("Item 3: " + item3);
    }
    public void findItem(String item)
    {
        if(item1 == null) {
            item1 = item;
            System.out.println(name + " found a " + item);
        } else if(item2 == null) {
            item2 = item;
            System.out.println(name + " found a " + item);
        } else if(item3 == null) {
            item3 = item;
            System.out.println(name + " found a " + item);
        } else {
            System.out.println("All item slots occupied.");
        }
    }
    public void useItem(String item)
    {
        if (item.equals("Potion") && (item1.equals("Potion") || item2.equals("Potion") || item3.equals("Potion"))) {
            level += 50;
            if(item1.equals(item)) {
                item1 = null;
            } else if (item2.equals(item)) {
                item2 = null;
            } else if (item3.equals(item)) {
                item3 = null;
            }
        } else if (item.equals("Elixir") && (item1.equals("Elixir") || item2.equals("Elixir") || item3.equals("Elixir")))  {
            level += 100;
            if(item.equals(item1)) {
                item1 = null;
            } else if (item.equals(item2)) {
                item2 = null;
            } else if (item.equals(item3)) {
                item3 = null;
            }
        } else if (item.equals("Amulet") && (item1.equals("Amulet") || item2.equals("Amulet") || item3.equals("Amulet"))) {
            level += 200;
            if(item.equals(item1)) {
                item1 = null;
            } else if (item.equals(item2)) {
                item2 = null;
            } else if (item.equals(item3)) {
                item3 = null;
            }
        } else {
            System.out.println("Item not in inventory.");
        }
        System.out.println(name + " used a " + item);
        System.out.println("Energy Level after using item: " + level);
    }
}
