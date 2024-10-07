package ExceptionHandling;

public class TryCatchFinally
{
    public static void main(String[] args) {
        try {
            int myInt;
            myInt = Integer.parseInt("String");
            System.out.println("After parsing we get: " + myInt);
            System.out.println(myInt);
        } catch(NumberFormatException | NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("DONE");   // no matter what, this statement will be printed
        }
        System.out.println ("=================");
    }
}
