package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBlock {
    public void tryCatch(String str) {
        try {
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        TryCatchBlock tcb = new TryCatchBlock();
        tcb.tryCatch(S);
    }

    /*
    public static void main(String[] args) {
        try {
            int myInt;
            myInt = Integer.parseInt("String");
            System.out.println("After parsing we get: " + myInt);
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//            myInt = Integer.parseInt(null);
//            System.out.println(myInt);
        } catch(NumberFormatException | NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
//        catch(NullPointerException npe) {
//            System.out.println(npe.getMessage());
//        } catch(IndexOutOfBoundsException iobe) {
//            System.out.println(iobe.getMessage());
//        }
    }
     */
}
