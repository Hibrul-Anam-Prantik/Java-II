package Tasks_LA03;

import java.util.Scanner;

public class Array_Task01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Remove Element = ");
        int num = sc.nextInt();
        int index = 0;
        boolean found = false;    // this flag is to check if the "Remove Element" is found or not
        System.out.println("Input array:");
        for(int i  =0; i <N; i++)
        {
            System.out.print(arr[i]+" ");
            if(arr[i] == num)
            {    // check the index of num(Remove Element)
                index = i;
                found = true;
            }
        }
        System.out.println();
        int[] newArr = new int[N-1];
        if(!found)
        {
            System.out.println("Element not found");
        } 
        else 
        {
        // creating new array
            int newIndex = 0;     // keeping an initial new index to access the newArr's index
            for(int i = 0; i < N; i++)
            {
                if( index != i){
                    newArr[newIndex++] = arr[i];
                }
            }
            System.out.println("New array:");
            for(int i  = 0; i <newArr.length; i++)  // printing new array
            {
                System.out.print(newArr[i]+" ");
            }
        }
        sc.close();
    }    
}
