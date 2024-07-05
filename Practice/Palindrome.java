package Practice;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        System.out.println("======================");
        palindromeCheck(str);
    }    
    public static void palindromeCheck(String word)
    {
        String newWord = "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            newWord += word.charAt(i);
        }
        if(newWord.equalsIgnoreCase(word)){
            System.out.println(word+" => PALINDROME");
        } else {
            System.out.println(word+" => NOT PALINDROME");
            System.out.println("======================\nRearranging the letters of the word \""+word+"\" and trying to make it palindrome.");
            makePalindrome(word);
        }
    }
    public static void makePalindrome(String word)
    {
        System.out.println("Still on it");    
    }
}
