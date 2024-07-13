package Task_LA_03;

import java.util.Scanner;

public class String_Task02 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();  // as stated in the question, the input must be in lower case
        String newStr = "";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int ascii;
            if(ch == 'a'){    // handling char 'a'
                ascii = (int)(ch) + 25;
                ch = (char)(ascii);
                newStr += ch;
            } else {        // handling other char
                ascii = (int)(ch) - 1;
                ch = (char)(ascii);
                newStr += ch;
            }
        }
        System.out.println(newStr);
        sc.close();
    }    
}
