package OOP;

import java.util.Scanner;

public class ClassTester 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Demo_Class\n\nEnter an String: ");
        Demo_Class dc = new Demo_Class();
        String s = dc.anything = sc.nextLine();
    //    sc.nextInt();
        System.out.println("OUTPUT");
        String newS = dc.anyS(s);
        System.out.println(newS);
        sc.close();
    }    
}

class Demo_Class
{
    public String anything;
    public int anyNumber;

    String anyS(String s)
    {
        return "The String is: " + s + "\nLength of the String: "+s.length();
    }
}
