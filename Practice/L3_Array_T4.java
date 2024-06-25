package Practice;

import java.util.Arrays;
import java.util.Scanner;
public class L3_Array_T4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        } 
        int[] uniqueArr = new int[N];
        int uniqueCount = 0;
        sc.close();
        for(int i = 0; i < N; i++)
        {
            boolean duplicate = false;
            for(int j = 0; j < N; j++)
            {
                if(arr[i] == uniqueArr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                uniqueArr[i] = arr[i];
                uniqueCount++;
            }   
        }
        System.out.println("unique Count: "+uniqueCount);
        System.out.println("Array: "+Arrays.toString(uniqueArr));
        for ( int i = 0; i < uniqueCount; i++)
        {
            int count = 0;
            for(int j = 0; j < N; j++)
            {
                if(uniqueArr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(uniqueArr[i]+" - "+count+" times");
        }
    }    
}