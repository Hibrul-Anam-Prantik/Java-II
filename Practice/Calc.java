package Practice;

public class Calc {
    public static void main(String[] args) {
        int x = (int)(Math.pow(8, 3));
        System.out.println(x);
        int y = x % 97;
        System.out.println(y);
        int z = (int)(Math.pow(y, 152));
        System.out.println(z);
        System.out.println(z % 97);
    }
}
