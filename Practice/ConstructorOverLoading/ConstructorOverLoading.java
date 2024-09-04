package Practice.ConstructorOverLoading;
public class ConstructorOverLoading 
{
    public static void main(String[] args) 
    {
        Car c1 = new Car();
        Car bmw = new Car("BMW", "M4");
        Car toyota = new Car("Toyota", "Premio");
        Car audi = new Car("Audi", "R8", 2019);
        c1.printDetails();
        bmw.printDetails();
        toyota.printDetails();
        audi.printDetails();
    }
}
class Car 
{
    String brand = "Not Set";
    String model = "Not Srt";
    int year;

    Car() {
        System.out.println("=====CAR=====");
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("=============");
    }
}