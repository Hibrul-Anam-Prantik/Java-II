package Tasks_LA02;

import java.util.Scanner;
public class Task9 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        if( num == 0){
            digit++;
        } else{
            for(int i = num; i != 0; i/=10)
            {
                digit ++;
            }
        }
        System.out.println(digit+" digits");
        sc.close();
    }   
}