package Practice;

import OOP.ArrayPrinter;

// import java.util.*;

public class Array_DiagonalSum 
{
    public static void main(String[] args) 
    {
        int[][] arr = {{1,2,3,4,1}, {5,6,7,8,1}, {9,10,11,12,1}, {13,14,15,16,1},{17,18,19,20,1}};
        ArrayPrinter ap = new ArrayPrinter();
        ap.print2D(arr);
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            // primary diagonal
                // i = j ;
            sum += arr[i][i];  
            // Secondary Diagonal
                // i + j = n - 1;
                // => j = n - 1 - i;
            if ( i != arr.length - 1 - i ) {    
                // condition to avoid adding the middle element twice
                sum += arr[i][arr.length - 1 - i];   
            }    
        }
        System.out.println(sum);
    }
}