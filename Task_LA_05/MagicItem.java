package Task_LA_05;

public class MagicItem 
{
    public String name;
    public int level;
    public String[] items;
    int iT;      // to keep a tract of the index of items[]
    
    public void newCharacter(String name)
    {
        this.name = name;
        level = 0;
        items = new String[3];
        iT = 0;
    }

    public void displayInfo()
    {
        System.out.println("Character Name: " + name);
        System.out.println("Energy Level: " + level);
        for (int i = 0; i < items.length; i++)
        {
            System.out.println("Item " + (i+1) + ": " + items[i]);
        }
    }

    public void findItem(String item)
    {
        if(iT < items.length) {
            items[iT++] = item;
            System.out.println(name + " found a " + item);
        } else {
            System.out.println("All item slots occupied.");
        }
    }

    public void useItem(String item)
    {
        boolean found = false;     // to check if the item is in the inventory or not
        String[] tempItems = new String[3];
        for(int i = 0; i < items.length; i++)
        {
            if(items[i] != null && items[i].equals(item) && items[i].equals("Potion")) {
                System.out.println(name + " used a " + item);
                level += 50;
                items[i] = tempItems[i]; 
                iT = i;   
                iT--;     // i used this part to hande the index of the used items, when we have to replace that used item with new found item
                found = true;
                System.out.println("Energy Level after using item: " + level);
                break;
            } else if (items[i] != null && items[i].equals(item) && items[i].equals("Elixir")) {
                System.out.println(name + " used a " + item);
                level += 100;
                items[i] = tempItems[i];
                iT = i;
                iT--;
                found = true;
                System.out.println("Energy Level after using item: " + level);
                break;
            } else if (items[i] != null && items[i].equals(item) && items[i].equals("Elixir")){
                System.out.println(name + " used a " + item);
                level += 200;
                items[i] = tempItems[i];
                iT = i;
                iT--;
                found = true;
                System.out.println("Energy Level after using item: " + level);
                break;
            } else {
                found = false;
            }
        }
        if(!found){
            System.out.println("Item not in inventory.");
        } 
    }
}
