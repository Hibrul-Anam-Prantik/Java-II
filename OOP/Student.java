package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String[] names;
    public int[] ids;

    public Student(int numSt) {
        names = new String[numSt];
        ids = new int[numSt];
    }

    public void profileCreator(int numSt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numSt; i++) {
            System.out.println("Student_" + (i + 1) + ":\n============");
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter ID: ");
            ids[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ids));
        sc.close();
    }
}
