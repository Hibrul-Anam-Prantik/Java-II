package Tasks;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("Largest number: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Largest number: " + n2);
        } else {
            System.out.println("Largest number: " + n3);
        }
        sc.close();
    }
}
