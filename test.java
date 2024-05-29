import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another Number: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.print("Summation\n---------\n");
        sum(num1, num2);
        System.out.println();
        System.out.print("Substraction\n------------\n");
        minus(num1, num2);
        System.out.println();
        System.out.print("Multiplication\n--------------\n");
        multiply(num1, num2);
        System.out.println();
        System.out.print("Division\n--------\n");
        division(num1, num2);
        sc.close();
    }

    public static void sum(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    public static void minus(int n1, int n2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public static void multiply(int n1, int n2) {
        System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
    }

    public static void division(int n1, int n2) {
        System.out.println(n1 + " ÷ " + n2 + " = " + ((n1 * 1.0) / n2));
        // System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / (n2 * 1.0)));
    }
}