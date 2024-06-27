package Tasks_LA03;

import java.util.Scanner;
import java.util.Arrays;

public class String_Task04 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3 ; i++)      // using loop to keep taking inputs, intil the I get the desied input
        {
            String str = sc.next();     // using .next(), because input must a signle word name
            str = str.toLowerCase();     // as mentioned in question, input must be in lowercase
            boolean valid = false;     // this flag will be used to print the desired outputs
            char[] chArr = new char[str.length()]; // making a array of the characters of "str"
            for(int j = 0; j < str.length(); j++)  
            {
                chArr[j] = str.charAt(j);
            }
            System.out.println(str+": "+Arrays.toString(chArr));
            // will find the unique characters to avoid duplicate counts
            char[] newArr = new char[chArr.length];
            int uniqueCount = 0;
            for(int k = 0; k < chArr.length; k++)
            {
                boolean duplicate = false;
                for(int l = 0; l < newArr.length; l++)
                {
                    if(chArr[k] == newArr[l]){
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    newArr[uniqueCount] = chArr[k];
                    uniqueCount++;
                }
            }
            // now we will proceed to count the characters
            for(int j = 0; j < uniqueCount; j++)
            {
                int count = 0;
                for(int k = 0; k < chArr.length; k++)
                {
                    if(newArr[j] == chArr[k]){
                        count++;
                    }
                }
                if(count != 0){     // this is to handle the inputs that are not desired
                    System.out.println("\""+newArr[j]+"\""+" has been counted "+count+" times int the word "+ str);
                } else if (i == 0 && count == 0){  // this will handle the case, where the the 1st input is our desied input
                    System.out.println("You entered "+ str+".");
                    break;
                } else {       // this is to hande if we get our desied input from other than 1st input 
                    System.out.println("Please enter another word.");
                    System.out.println("You entered "+ str+".");
                    break;
                }
            }
        }
        sc.close();
    }
}
