package Tasks_LA03;

import java.util.Scanner;

public class Array_Task02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];     // length in given in question which is 5
        for( int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];   // assuming the 1st elements to be the maximun and minimun values
        int maxI = 0;
        int min = arr[0];
        int minI = 0;
        for( int i = 0; i < 4; i++)
        {
            if(arr[i] > max)
                {
                    max = arr[i];
                    maxI = i;
                }
            if(arr[i] < min)
            {
                min = arr[i];
                minI = i;
            }
        }
        System.out.println("The largest number "+max+" was found at location "+maxI+".");
        System.out.println("The smallest number "+min+" was found at location "+minI+".");
        sc.close();
    }
}
