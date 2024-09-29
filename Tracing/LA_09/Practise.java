package Tracing.LA_09;

public class Practise {
    public static void main(String[] args) {
    int temp = 7;
    int sum = 20; int k = 3; int y = 8;
        System.out.println("Temp: " + temp);
        temp = temp++; System.out.println("temp = temp++: " + temp + "  " + temp);
        sum = ++temp + k; System.out.println("sum = ++temp + k: " + sum + "  " + temp + "  " + k);
        y = (sum++) - 1;  System.out.println("y = (sum++) - 1: " + y + " " + sum);
        System.out.println(y+" "+temp+" "+y);


    }

}
