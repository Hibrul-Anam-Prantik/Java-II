package Tasks;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        multiplication_table(n, m);
    }

    public static void multiplication_table(int a, int b) {
        if (b > 10) {
            return;
        } else {
            System.out.println(a + " x " + b + " = " + (a * b));
            multiplication_table(a, b + 1);
        }
    }
}
