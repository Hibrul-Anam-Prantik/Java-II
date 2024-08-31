package OOP.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        FisH tuna = new FisH();
        tuna.eats();
        Bird raven = new Bird();
        raven.breathes();
        raven.fly();
    }
}

// Base Class
class Earthlings {
    String color;
    int leg;

    void eats() {
        System.out.println("Eats");
    }

    void breathes() {
        System.out.println("Breathes");
    }
}

// Derived Class
class Human extends Earthlings {
    String name;

    void ability() {
        System.out.println("Power of Thinking");
    }
}

// Derived Class
class Mammal extends Earthlings {
    void walks() {
        System.out.println("Walks");
    }
}

// Derived Class
class FisH extends Earthlings {
    void swims() {
        System.out.println("Swims");
    }
}
// Derived Class
class Bird extends Earthlings {    
    void fly() {
        System.out.println("Flies");
    }
}
