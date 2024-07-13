package Task_LA_01;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i <= 1; i++) {
            int digit = id % 10;
            id /= 10;
            System.out.println(digit);
        }
        sc.close();
    }
}
