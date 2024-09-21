package Task_LA_08;

public class Passenger
{
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double fare;
    public double baggageWeight;
    public double distance;

    public Passenger(String name, double distance)
    {
        this.name = name;
        this.distance = distance;
        fare = distance * 20;
        total_fare += fare;
        no_of_passenger ++;
    }

    public void passengerDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Fare: " + fare + "TK");
    }

    public void setBaggageWeight (double weight)
    {
        baggageWeight = weight;
        double baggageFare = 10 * baggageWeight;
        fare += baggageFare;
        total_fare += baggageFare;  // adding only the baggageFare, as the distance fare is already added
    }

}
