package Task_LA_01;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Divisible by Both");
        } else if (num % 5 == 0 && num % 7 != 0) {
            System.out.println("Invalid: Divisible by 5 Only");
        } else if (num % 7 == 0 && num % 5 != 0) {
            System.out.println("Invalid: Divisible by 7 Only");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
