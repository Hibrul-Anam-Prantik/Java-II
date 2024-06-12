package Tasks_LA02;

import java.util.Scanner;

public class Task5 
{
    public static void main(String[] args)
    {
        int zeroCount = 0;
        int numCount = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++)
        {
            int num = sc.nextInt();
            sum += num;
            if(num == 0){
                zeroCount ++;
            } else{
                numCount ++;
                zeroCount = 0;
            }
            if(zeroCount == 3){
                break;
            }
        }
        if(sum == 0){
            System.out.println("No numbers found");
        } else{
            double avg = (sum*1.0)/numCount;
            System.out.println("Sum = "+sum);
            System.out.println("Average  = "+avg);
        }
        sc.close();
    }
}