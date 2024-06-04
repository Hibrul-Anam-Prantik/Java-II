package Tasks;

public class Task_1 {
    public static void main(String[] args) {
        // A
        int var = 5;
        System.out.println("Integer Variable: " + var);
        // B
        int x = 3;
        var += x;
        System.out.println("Addition: " + var);
        // C
        var = 5; // initializing var again, as my decladed variable was 5
        System.out.println("Product: " + var * x);
        System.out.println("Division: " + var * 1.0 / x);
        // D
        double varD = 5.0;
        System.out.println("Double Variable: " + varD);
        double xD = 3.0;
        varD += xD;
        System.out.println("Addition: " + varD);
        varD = 5.0; // initializing var again, as my decladed variable was 5.0
        System.out.println("Product: " + varD * xD);
        System.out.println("Division: " + varD / xD);
        // E
        double var_D = 5.0;
        System.out.println("Double Variable: " + var_D);
        int xI = 3;
        var_D += xI;
        System.out.println("Addition: " + var_D);
        var_D = 5; // initializing var again, as my decladed variable was 5
        System.out.println("Product: " + var_D * xI);
        System.out.println("Division: " + var_D / xI);
    }
}
