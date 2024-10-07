package ExceptionHandling;

import java.util.Scanner;

public class TryCatchBlock
{
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
}
