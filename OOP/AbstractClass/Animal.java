package OOP.AbstractClass;

public abstract class Animal {
    public String name = "Not set";
    public String color = "Not set";
    protected double price;
    public String sound;
    public String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public abstract void setPrice(double price);

    public abstract double getPrice();

    public void makeSound(String make) {
        sound = make;
    }

    public abstract void eat();

    public void action() {
        System.out.println("The " + animal + " is sleeping.");
    }
}
