package Tasks_LA02;

import java.util.Scanner;
public class Task9 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        // a
        int numA = sc.nextInt(); 
        int digit = digitCount(numA);
        System.out.println(digit+" digits");
        
        //b
        int numB = sc.nextInt();
        int digitB = digitCount(numB);   // i calculated the digit number to decide, how many zeroes i need to divide the number by.
        int divider = divider(digitB);    // for calcutating the diviser to get the 1st digit of the number
        multiplier(numB,divider);     
        sc.close();
    }
    public static int digitCount(int num)
        {    
            int digit = 0;
            if( num == 0){
                digit++;
            } else{
                for(int i = num; i != 0; i/=10)
                {
                    digit ++;
                }
            }
            return digit;
        }
    public static void multiplier(int numB, int divider)
    {
        if(numB == 0){
            return;
        }
        System.out.print((numB / divider)*7+"  ");
        
        multiplier(numB % divider, divider/10);
    }
    public static int divider(int digit)
    {
        int divider = 1;
        for(int i = 1; i < digit; i++){
            divider *= 10;
        }
        return divider;
    }  
}