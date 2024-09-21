package Task_LA_07;

public class Toy
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