package OOP;

import java.util.Scanner;

public class Student {
    public String name;
    public int id;

    public void profileCreator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name = sc.nextLine();
        System.out.println("Enter Your ID: ");
        id = sc.nextInt();
    }
}
