package Tasks;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Largest number: " + num3);
        }
        sc.close();
    }
}
