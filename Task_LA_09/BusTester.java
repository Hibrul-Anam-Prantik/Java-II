package Task_LA_09;

public class BusTester
{
    public static void main(String args[]){
        Bus b1 = new Bus(4, "Jatrabari");
        System.out.println("1--------------");
        Bus b2 = new Bus(10, "Gazipur");
        System.out.println("2--------------");
        b1.addPassenger("Fahim", "Mirpur");
        System.out.println("3--------------");
        b1.addPassenger("Anika", "Jatrabari");
        System.out.println("4--------------");
        b1.addPassenger("Ali");
        System.out.println("5--------------");
        b1.addPassenger("Zafar");
        System.out.println("6--------------");
        b1.addPassenger("Mim", "Badda");
        b1.addPassenger("Nowrin");
        System.out.println("7--------------");
        b1.addPassenger("Walid", "Jatrabari");
    }
}

class Bus
{
    int capacity;
    String destination;

    Bus(int capacity, String destination) {
        System.out.println("Capacity: " + capacity + "\nDestination: " + destination);
        this.capacity = capacity;
        this.destination = destination;
    }

    void addPassenger(String name, String location) {
        if(capacity > 0) {
            if(location.equals(destination)) {
                System.out.println(name + " is added to the bus.");
                capacity --;   // 1 person added to the bus
            } else {
                System.out.println("Sorry " + name + "! The bus won't stop at " + location + "\nUse another bus.");
            }
        } else System.out.println("Bus is full");
    }

    void addPassenger(String name) {
        System.out.println(name + " is  added to the bus.\nAli will get off at the last stop");
        capacity --;
    }
}
