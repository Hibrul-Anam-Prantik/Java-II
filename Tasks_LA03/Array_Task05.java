package Tasks_LA03;

import java.util.Scanner;

public class Array_Task05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        // creating the array
        System.out.println("Please enter the elements of the array:");
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        // new array 
        int[] newArr = new int[N];
        int j = 0;          // to manipulate the index of the newArr
        newArr[j++] = arr[0]; // initializing the 1st element of the newArr
        int count = 0;     // to count the removed elements
        // checking for the duplicate elements
        for(int i = 1; i < N; i++)
        {
            if (arr[i] != arr[i-1])      // comparing with the previous element 
            {
                newArr[j++] = arr[i];   // if no duplicates are found
            } 
            else 
            {
                count++;    // if duplicates are found
            }
        }   
        // print new array
        System.out.print("New Array : ");
        for (int i = 0; i < j; i++)
        {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
        System.out.println("Removed elements : "+count);
        sc.close();
    }    
}
