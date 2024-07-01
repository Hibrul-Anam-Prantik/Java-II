package Tasks_LA03;
import java.util.Arrays;
import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++)
        {
            String str = sc.next().toLowerCase();
            int len = str.length();
            char[] chArr = uniqueChar(len, str);
            int uniqueCount = chArr.length;
            boolean printer = false;
            boolean valid = false;
            boolean flag = false;
            for(int j = 0; j < uniqueCount; j++)
            {
                int count = 0;
                valid = false;
                for(int k = 0; k < str.length(); k++)
                {

                    if(chArr[j] == str.charAt(k))
                    {
                        count++;
                    }
                }
                if(count <= 1){
                    valid  = true;
                    
                } else{
                    valid = false;
                }
                if(!valid){
                    System.out.println("\""+chArr[j]+"\" has been counted "+count+" times in the word \""+str+"\".");
                    flag = true;
                } else {
                    continue;
                }   
            } 
            if(flag){
                System.out.println("Please enter another word.");
            } else{
                System.out.println("You entered "+str+".");
                printer = true;
            }
            
            if(printer){
                break;
            }
        }
    }
    public static char[] uniqueChar(int len, String str)
    {
        char[] arr = new char[len];
        for(int i = 0 ; i < len; i++)
        {
            arr[i] = str.charAt(i);
        }
        char[] newArr = new char[len];  // new array; to get the unique char; in order to avoid duplicate outputs
        int uniqueCount = 0;   
        for(int i = 0; i < len; i++)     // unique array creation
        {
            boolean duplicate = false;
            for(int j = 0; j < len; j++)
            {
                if(arr[i] == newArr[j]){
                    duplicate = true;
                    break;
                }
            } 
            if(!duplicate){     // interting values to unique array
                newArr[uniqueCount] = arr[i];
                uniqueCount++;
            }   
        }
        char[] uniqueArr = new char[uniqueCount];
        for(int i = 0; i < uniqueCount; i++)
        {
            uniqueArr[i] = newArr[i];
        }
        return uniqueArr;
    }
}
