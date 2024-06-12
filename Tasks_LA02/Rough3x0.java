package Tasks_LA02;

import java.util.Scanner;

public class Rough3x0 
{
    public static void main(String[] args) 
    {
        int count1 = 0;
        int count2 = 0;
        int s = 0;     // sum
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++)
        {
            int x = sc.nextInt();
            s += x;
            if(x == 0){
                count1 ++;
            } else{
                count2 ++;
                count1 = 0;
            }
            if(count1 == 3){
                break;
            }
        }
        if(s == 0){
            System.out.println("No numbers found");
        } else{
            double a = (s*1.0)/count2;   // average
            System.out.println("Sum = "+s);
            System.out.println("Average  = "+a);
        }
        sc.close();
    }
}
