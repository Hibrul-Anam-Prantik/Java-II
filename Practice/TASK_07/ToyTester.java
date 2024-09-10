package Practice.TASK_07;

public class ToyTester{
    public static void main(String[] args){
        Toy t1 = new Toy("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        Toy t2 = new Toy("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }
}

class Toy 
{
    public String name;
    public int price;

    public Toy(String toyName, int price) {
        name = toyName;
        this.price = price;
        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int update) {
        price = update;
    }

    public void updateName(String update) {
        System.out.println("Changing old name: " + name);
        name = update;
        System.out.println("new name: " + name);
    }

    public void showPrice() {
        System.out.println("price: " + price  +" Taka");
    }
}