package OOP;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("How many students are there?\n=> ");
        Scanner sc = new Scanner(System.in);
        int numSt = sc.nextInt();
        sc.nextLine();
        Student s1 = new Student(numSt);
        s1.profileCreator(numSt);
        sc.close();
    }
}