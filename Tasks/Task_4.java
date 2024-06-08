package Tasks;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        multiplicationTable(n, num);
    }

    public static void multiplicationTable(int n, int num) {
        if (num > 10) {
            return;
        }
        System.out.println(n + " x " + num + " = " + (n * num));
        multiplicationTable(n, num + 1);
    }
}
