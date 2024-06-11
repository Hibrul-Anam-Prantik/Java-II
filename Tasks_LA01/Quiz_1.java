package Tasks_LA01;

import java.util.Scanner;

public class Quiz_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in the Fahrenheit scale: ");
        double tF = sc.nextDouble();
        double tC = (tF - 32) * 5/9;
        //System.out.println("Temperature in the Celsius scale is: "+tC);
        
        String state;
        if(tC <= 0){
            state = "Solid";
        } else if(tC > 0 && tC < 100){
            state = "Liquid";
        } else {  //tC >= 100
            state = "Gas";
        }   
        System.out.println("At "+tF+"F ("+tC+"C), water is in a "+state+" state.");
        
        /*
        if(tC <= 0){
            System.out.println("At "+tF+"F ("+tC+"C), water is in a Solid state.");
        } else if(tC > 0 && tC < 100){
            System.out.println("At "+tF+"F ("+tC+"C), water is in a Liquid state.");
        } else {  //tC >= 100
            System.out.println("At "+tF+"F ("+tC+"C), water is in a Gas state.");
        }
        */
        sc.close();
    }
}