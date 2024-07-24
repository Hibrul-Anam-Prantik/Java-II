package Practice;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("======================");
        palindromeCheck(str);
    }    
    public static void palindromeCheck(String word)
    { 
        boolean isPalindrome = false;
        for(int i = 0; i < word.length()/2; i++)
        {
            if (word.charAt(i) == word.charAt(word.length()-1-i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " => Palindrome");
        } else {
            System.out.println(word + " => Not Palindrome");
            makePalindrome(word);
        }
    }

    
    public static void makePalindrome(String word)
    {
        System.out.println(word + " => PROCESSING");    
    }
}
