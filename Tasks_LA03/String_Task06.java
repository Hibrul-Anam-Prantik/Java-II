package Tasks_LA03;

import java.util.Scanner;

public class String_Task06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        for(int i = 0; i < str.length()-1; i++)
        {

            char chOuter = str.charAt(i);
            boolean match = false;
            for ( int j = i+1; j < str.length(); j++)
            {
                char chInner = str.charAt(j);
                int count = 0;
                if( chOuter == chInner){
                    count++;
                }
                if(count == 0){
                    newStr += chOuter;
                    break;
                } else{
                    newStr +="";
                    continue;
                }
            } 
        }
        System.out.println(newStr);
        sc.close();
    }    
}
