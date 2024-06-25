package Tasks_LA03;

import java.util.Scanner;

public class String_Task01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revStr = "";   // empty string
        for(int i = str.length()-1; i >= 0 ; i--)  // making a reverse string of the string given by the user
        {
            revStr += str.charAt(i);
        }
        if(revStr.equals(str)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }    
}
