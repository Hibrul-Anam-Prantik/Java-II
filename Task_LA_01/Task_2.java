package Task_LA_01;

public class Task_2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Before Swapping-\nnum1 = " + num1 + "\nnum2 = " + num2);
        // Swap (By Creating a third variable)
        int swap;
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After Swapping(Creating a third var)-\nnum1 = " + num1 + "\nnum2 = " + num2);
        // reset the values
        num1 = 5;
        num2 = 10;
        System.out.println("Before Swapping-\nnum1 = " + num1 + "\nnum2 = " + num2);
        // Swap (Without creating any other variables)
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping(Creating a third var)-\nnum1 = " + num1 + "\nnum2 = " + num2);
    }
}
