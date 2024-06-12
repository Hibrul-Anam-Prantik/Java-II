package Tasks_LA02;

/*Fibonacci sequence is a sequence in which each number is the sum of the two preceding numbers, where starting values are most commonly two 1s (1, 1, . . .)
(a) Write a java program to display the fibonacci sequence until an input number.
(b) Write a java program to display the fibonacci sequence until an input number, along with the sum of the sequence.
 */

import java.util.Scanner;

public class Task7 
{
    public static void main(String[] args) 
    {
        // a
        int num1 = 1;
        int num2 = 1;
        int numNext;   // sum of first 2 number
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
            num1 = num2;
            num2 = numNext;
        } 
        System.out.println();
        
        // b
        num1 = 1;
        num2 = 1;
        numNext = 2; 
        numUser = sc.nextInt();    /// sum of first 2 number
        int sum = num1 + num2;        
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
