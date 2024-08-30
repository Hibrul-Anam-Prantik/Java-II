package OOP;

public class Inheritance_MultiLevel {
    public static void main(String[] args) {
        Cats meow = new Cats();
        meow.color = "Brown";
        meow.name = "Meow";
        System.out.println(meow.name);
        System.out.println(meow.color);
        meow.bodyLayer();
        meow.eat();
        meow.activity();
        meow.leg = 4;
        System.out.println(meow.leg);
    }
}

// Base Class
class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breathes");
    }
}

// Derived Class
class Mammals extends Animals {
    int leg;
    void bodyLayer() {
        System.out.println("Have Skin");
    }
}

// Derived Class
class Cats extends Mammals {
    String name;
    void activity() {
        System.out.println("Sitting");
    }
}
