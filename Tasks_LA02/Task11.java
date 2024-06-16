package Tasks_LA02;

import java.util.Scanner;

public class Task11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // a) Square pattern
        int termA = sc.nextInt();
        for(int i = 1; i <= termA; i++)
        {
            for(int j = 1; j <= termA; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // b) Triangle pattern
        int termB = sc.nextInt();
        for(int i = 1; i <= termB; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
