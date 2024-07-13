package Task_LA_02;

import java.util.Scanner;
public class Task8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int primeCount = 0;
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        while(i <= end)
        {
            
            if (i >= 2){
                int primeCheck = 0;
                for(int j = 2; j <= i/2; j++){
                    if(i % j == 0){
                        primeCheck ++ ;
                        break;
                    }  
                }
                if(primeCheck == 0){
                    primeCount ++;
                }
            }
            i ++;
        }
        System.out.println("There are "+primeCount+" prime numbers between "+start+" and "+end+".");
        sc.close();
    }
}
