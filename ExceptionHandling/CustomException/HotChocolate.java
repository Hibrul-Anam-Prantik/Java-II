package ExceptionHandling.CustomException;

import java.util.concurrent.TimeUnit;

public class HotChocolate
{
    // Ideal Temperature for Hot chocolate is between (160, 185) degree Fahrenheit
    public static double tooHot = 185;
    public static double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TemperatureException
    {
        if(cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if(cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

//    Basic
//    public static void main(String[] args)
//    {
//        double currentCocoaTemp = 170;
//
//        try {
//            drinkHotChocolate(currentCocoaTemp);
//            System.out.println("That cocoa was good!");
//        } catch (TooHotException e) {
//            System.out.println("TOO HOT");
//        } catch(TooColdException e) {
//            System.out.println("TOO COLD");
//        }
//        System.out.println("And it's gone");
//    }

    // Advanced
    public static void main(String[] args) throws TemperatureException, InterruptedException {
        double currentCocoaTemp = 150;
        boolean wrongTemp = true;

        while(wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("The cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e) {
                System.out.println("TOO HOT");
                currentCocoaTemp -= 5;
            } catch (TooColdException e) {
                System.out.println("TOO COLD");
                currentCocoaTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);   // takes 2 sec to execute the next circle
        }
        System.out.println("And it's gone");
    }
}
