package ExceptionHandling;

public class FinallyBehavior
{
    private static String finallyTest() {
        try {
            return "Try";
        } catch(Exception e) {
            return "Catch";
        } finally {
            return "Finally";  // this will always overRide the "try" or "catch" block; always
        }
    }

    public static void main(String[] args) {
        System.out.println(finallyTest());
    }
}
