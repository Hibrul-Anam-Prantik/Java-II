import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String s = bark();  // returned => "Alfi is barking"
        System.out.println(s);
        // or
        int a = add(3,4);   // sum = 7
        // so, a = 7;
        System.out.print(a);
    }
    public static String bark(){
        String s = "Alfi is barking";
        // System.out.println("Alfi is barking");
        // return "";
        return s;
    }
    public static int add(int x, int y){
        int sum = x+y;
        return sum;
    }
}