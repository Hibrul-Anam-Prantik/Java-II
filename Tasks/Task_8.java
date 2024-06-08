package Tasks;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt(); // 24101230 -> 8 digits ;
        // as we need 1st 3 digits; have to divide by 100000
        int year = year(id);
        String session = session(id / 100000);
        System.out.println("Student Joined BRAC in " + session + " " + year);
        sc.close();
    }

    public static int year(int a) {
        a /= 100000;
        return a / 10;
    }

    public static String session(int a) {
        a %= 10;
        if (a == 1) {
            return "Spring";
        } else if (a == 2) {
            return "Fall";
        }
        return "Summer";
    }
}
