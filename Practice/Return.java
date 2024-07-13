package Practice;

public class Return {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = num3(1,5);   // 6
        int sum = a + b +c;
        System.out.println("c: " + c + "\nSum: "+sum);
    }
    public static int num3(int x, int y)  // 1    5
    {
        int z = x + y;   
        return z;   // 6
    }
}
