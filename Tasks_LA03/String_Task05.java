package Tasks_LA03;

import java.util.Scanner;

public class String_Task05 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String newStr = str1 + " " + str2;   //  Concatenating those two strings
        System.out.println(newStr);
        int sum = 0;
        for(int i = 0; i < newStr.length(); i++)
        {
            char ch = newStr.charAt(i);
            if ( (ch >= 65 && ch <= 90) || (ch >=97 && ch <= 122)){
                sum += ch;
            }
        }
        System.out.println(sum);
        sc.close();
    }    
}
