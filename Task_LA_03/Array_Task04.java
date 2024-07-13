package Task_LA_03;
import java.util.Scanner;
public class Array_Task04 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)   // array creation
        {
            arr[i] = sc.nextInt();
        } 
        int[] uniqueArr = new int[N];  // new array; to get the unique numbers; in order to avoid duplicate outputs
        int uniqueCount = 0;   
        for(int i = 0; i < N; i++)     // unique array creation
        {
            boolean duplicate = false;
            for(int j = 0; j < N; j++)
            {
                if(arr[i] == uniqueArr[j]){
                    duplicate = true;
                    break;
                }
            } 
            if(!duplicate){     // interting values to unique array
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }   
        }
        for ( int i = 0; i < uniqueCount; i++)     //counting the unique numbers
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
        sc.close();
    }   
}
