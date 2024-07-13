package Task_LA_05;

public class UberApp 
{
    public String name;
    public int age;
    public String phNum;    // mobile number
    public String location;
    public double distance;
    public int rideNum = 3;      // number of rides
    public String[] locations;
    int iL;       // to keep track of the index of locations[]
    public void createProfile(String name, int age, String phNum)
    {
        this.name = name;
        this.age = age;
        this.phNum = phNum;
        locations = new String[rideNum];
        iL = 0;
    }

    public void showProfile()
    {
        System.out.println("Hello! This is your Profile:\nFull Name: " + name + "\nAge: " + age + "\nPhone Number: " + phNum);
    }

    public int remainingRides()
    {
        return rideNum;
    }

    public void bookRide(String location, double distance)
    {
        this.location = location;
        this.distance = distance;
        if ( iL >= 3 ) {
            System.out.println(name + ", please update your plan to premium or wait till next month!");
        } else {
            locations[iL++] = location;
            rideNum--;
            System.out.println(name + " has booked a ride!");
            System.out.println("Destination: " + location);
            double fare = 30 * distance;
            System.out.println("Fare: " + fare + " Taka");
        }
    }

    public void changeLocation(String location, double distance)
    {
        this.location = location;
        locations[iL - 1] = location;
        System.out.println(name + " has changed the destination of his current ride to " + location);
        double fare = 30 * distance;
        double newFare = fare + fare * 0.2;
        System.out.println("New fare after adding 20% change fees: " + newFare + " Taka.");
    }

    public void ridingHistory()
    {
        if(iL == 0) {
            System.out.println(name + ", you haven't visited anywhere this month.");
        } else {
            System.out.print(name + ", you have visited ");
            for(int i = 0; i < iL; i++)
            {
                if (i < iL - 1) {
                    System.out.print(locations[i] + ", ");
                } else {
                    System.out.println(locations[i] + " this month.");
                }
            }
        }
    }
    

    public void resetMonth()
    {
        rideNum = 3; 
        iL = 0;   
        String[] resetLoc = new String[rideNum];
        locations = resetLoc;   // resetting the locations
    }
}
