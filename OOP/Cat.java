package OOP;

import java.util.Scanner;

public class Cat 
{
    public String color;
    public String action;
    
    public void details()
    {
        System.out.println("The "+color+" cat is "+action);
    }
    public void cat()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the color of the Cat: ");
        color = sc.nextLine();
        System.out.print("Enter the action of the Cat: ");
        action = sc.nextLine();
        System.out.println("The "+color+" cat is "+action);
        sc.close();
    }
}
