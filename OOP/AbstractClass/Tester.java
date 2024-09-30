package OOP.AbstractClass;

public class Tester
{
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.name = "Max";
        doggy.color = "Brown";
        doggy.setPrice(3.5);
        doggy.eat();
        System.out.println(doggy.name + "'s (" + doggy.color + " " + doggy.animal + ") price: " + doggy.getPrice() + " $.");
        doggy.action();
        System.out.println("==================================");
        Cat pussy = new Cat("Cat");
        pussy.name = "Candy";
        pussy.setColor("Black"); pussy.setColor("White");
        pussy.setPrice(5.7);
        pussy.action();
        pussy.eat();
        System.out.println(pussy.name+ "'s (" + pussy.color + " " + pussy.animal + ") price: " + pussy.getPrice() + " $.");

        // Casting
        Object dog = new Dog();
        Dog dg = (Dog) dog;
        dg.eat();
    }
}

class Dog extends Animal {

    Dog() {
        super("Dog");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void eat() {
        System.out.println(name + " the " + color + " " + animal + " is eating.");
    }
}

class Cat extends Animal {

    Cat(String set) {
        super(set);
        animal = set;
    }

    public void setPrice(double set) {
        price = set;
    }

    public double getPrice() {
        return price;
    }

    public void eat() {
        System.out.println("My cat, " + name + ", is eating.");
    }

    void setColor(String color) {
        this.color = color;
    }

    public void action() {
        System.out.println("The cat is playing");
    }
}
