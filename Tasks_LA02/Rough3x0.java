package Tasks_LA02;

import java.util.Scanner;

public class Rough3x0 
{
    public static void main(String[] args) 
    {
        int count1 = 0;
        int count2 = 0;
        int s = 0;     // sum
        int mn = 0;    // minimun
        int mx = 0;    // maximum
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
            if((i==0 || x > mx) && x != 0){
                mx = x;
            } 
            if((i==0 || x < mn) && x != 0){
                mn = x;
            }
        }
        if(s == 0)
        {
            System.out.println("No numbers found");
        } 
        else
        {
            double a = (s*1.0)/count2;   // average
            System.out.println("Sum = "+s);
            System.out.println("Minimum = "+mn);
            System.out.println("Maximun = "+mx);
            System.out.println("Average  = "+a);
        }
        sc.close();
    }
}
