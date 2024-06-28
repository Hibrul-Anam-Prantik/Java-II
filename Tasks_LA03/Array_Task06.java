package Tasks_LA03;

import java.util.Scanner;

public class Array_Task06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        // creating array
        int[] arr = new int[len];
        for (int  i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        } 
        // array sorting => from low to high
        int temp;
        for( int i = 0; i < len -1; i++)
        {
            for( int j = i+1; j < len; j++)
            {
                if(arr[j] < arr[i])
                {                      // swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int med;
        if( len%2 == 0 )       // median calc for an even length
        {
            med = (arr[len/2] + arr[(len/2)-1]) / 2;
        }
        else                   // median calc for an odd length
        {
            med = arr[(len/2)];
        }
        System.out.println("The median is "+med+".");
        sc.close();
    }    
}
