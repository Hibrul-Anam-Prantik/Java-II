package Tasks_LA03;

import java.util.Scanner;

public class String_Task06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        newStr += str.charAt(0);   // initialing the 1st char at the newStr
        // cheching for the consecutive duplicates
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) != str.charAt(i-1))    // if the current index's char is not equals to the previous index's char; 
            {                                       // then adding it the newStr
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
        sc.close();
    }    
}