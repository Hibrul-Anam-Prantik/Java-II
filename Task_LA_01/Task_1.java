package Task_LA_01;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // A
        int var = 5;
        System.out.println("Integer Variable: " + var);
        // B
        int x = 3;
        var += x;
        System.out.println("Addition: " + var);
        // C
        var = 5; // initializing var again, as my decladed variable was 5
        System.out.println("Product: " + var * x);
        System.out.println("Division: " + var / x);
        // D
        double varD = 5.0;
        System.out.println("Double Variable: " + varD);
        double xD = 3.0;
        varD += xD;
        System.out.println("Addition: " + varD);
        varD = 5.0; // initializing var again, as my decladed variable was 5.0
        System.out.println("Product: " + varD * xD);
        System.out.println("Division: " + varD / xD);
        // E
        varD = 5.0;
        System.out.println("Double Variable: " + varD);
        x = 3;
        varD += x;
        System.out.println("Addition: " + varD);
        varD = 5; // initializing var again, as my decladed variable was 5
        System.out.println("Product: " + varD * x);
        System.out.println("Division: " + varD / x);
        // F
        String varS = "Hello ";
        String xS = "World.";
        varS += xS;
        System.out.println("Addition: " + varS); /*
                                                  * the addition for string works like: if we add two strings (i)
                                                  * "CSE111", (ii) "is Awesome", then the new string will be "CSE111is
                                                  * Awesome"; it simple connects 2 strings like this
                                                  */
        // if 1st var is int and 2nd is sting
        var = 5;
        varS = "number";
        System.out.println(var + varS);
        // now if 1st var is String and 2nd is int
        varS = "Number";
        var = 5;
        varS += var;
        System.out.println(varS);
        // G
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        var = sc.nextInt();
        System.out.print("Enter an Integer: ");
        x = sc.nextInt();
        var += x;
        System.out.println(var);
        sc.close();
    }
}
