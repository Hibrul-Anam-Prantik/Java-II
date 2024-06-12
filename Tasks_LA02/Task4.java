package Tasks_LA02;

import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        int max = 0;
        int numCount = 0;
        for(int i = 0; i < 10; i++)
        {
            int num = sc.nextInt();
            if(num > 0 && num%2 != 0 )
            {
                numCount++;
                sum += num;
                if(i==0 || num > max){
                    max = num;
                } 
                if(i==0 || num < min){
                    min = num;
                }
            }
        }
        if(numCount == 0){
            System.out.println("No odd positive numbers found");
        } else{
            double avg = (sum*1.0)/numCount;
            System.out.println("Sum = "+sum);
            System.out.println("Minimum = "+min);
            System.out.println("Maximun = "+max);
            System.out.println("Average  = "+avg);
        }
    }    
}