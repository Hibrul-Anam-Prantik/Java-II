package Task_LA_03;

import java.util.Scanner;

public class Array_Task03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");  
        int len = sc.nextInt();
        int[] arr = new int[len]; 
        // creating array
        for (int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        // reversing the array
        int temp;
        for(int i = 0; i < len/2; i++)
        {
            // handling the reversig 
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;     // this helps to store the values reversely 
        }
        // printing the reversed array 
        for(int i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }    
}
