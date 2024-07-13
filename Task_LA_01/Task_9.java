package Task_LA_01;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cg = sc.nextFloat();
        int credit = sc.nextInt();
        if (credit < 30) {
            System.out.println("The student is not eligible for a waiver");
        } else {
            if (cg >= 3.80 && cg <= 3.89) {
                System.out.println("The student is eligible for a waiver of 25 percent");
            } else if (cg >= 3.90 && cg <= 3.94) {
                System.out.println("The student is eligible for a waiver of 50 percent");
            } else if (cg >= 3.95 && cg <= 3.99) {
                System.out.println("The student is eligible for a waiver of 75 percent");
            } else {
                System.out.println("The student is eligible for a waiver of 100 percent");
            }
        }
        sc.close();
    }
}
