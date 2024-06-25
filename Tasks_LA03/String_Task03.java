package Tasks_LA03;

import java.util.Scanner;

public class String_Task03 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();  // as stated in the question; user input must be exactly one word, thats why i am using ".next()", insted of ".nextLine()"
        String newStr = "";    // new String 
        for (int i = 0; i < str.length(); i++)
        {
            newStr += str.charAt(i);
            System.out.println(newStr);
        } 
        sc.close();
    }
}   
    
