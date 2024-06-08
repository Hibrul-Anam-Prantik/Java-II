package Tasks;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt(); // 24101230 -> 8 digits ;
        int year = year(id);
        String session = session(id);
        System.out.println("Student Joined BRAC in " + session + " " + year);
        sc.close();
    }

    public static int year(int a) {
        a /= 1000000;
        return a;
    }

    public static String session(int a) {
        a /= 100000; // 1st 3 digits
        a %= 10; // 3rd digit
        if (a == 1) {
            return "Spring";
        } else if (a == 2) {
            return "Fall";
        }
        return "Summer"; // 3
    }
}
