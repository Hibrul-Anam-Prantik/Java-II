package Tasks_LA02;

import java.util.Scanner;

public class Rough3x0 
{
    public static void main(String[] args) 
    {
        int count1 = 0;
        int count2 = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++)
        {
            int num = sc.nextInt();
            sum += num;
            if(num == 0){
                count1 ++;
            } else{
                count2 ++;
                count1 = 0;
            }
            if(count1 == 3){
                break;
            }
        }
        if(sum == 0){
            System.out.println("No numbers found");
        } else{
            double avg = (sum*1.0)/count2;
            System.out.println("Sum = "+sum);
            System.out.println("Average  = "+avg);
        }
        sc.close();
    }
}
