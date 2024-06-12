package Tasks_LA02;

import java.util.Scanner;

public class Task8 
{
    public static void main(String[] args) 
    {
        // a
        int num1 = 1;
        int num2 = 1;
        int numNext;   // sum of first 2 number
        int sum = num1 + num2;
        Scanner sc = new Scanner(System.in);
        int numUser = sc.nextInt();
        System.out.print(num1 +" "+num2+" ");
        for(int i = num2; ; i++)
        {
            numNext = num1 + num2;
            if(numNext > numUser){
                break;
            }
            System.out.print(numNext+" ");
            sum += numNext;
            num1 = num2;
            num2 = numNext;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        sc.close();
    }    
}
