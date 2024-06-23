package Tasks_LA02;

import java.util.Scanner;

public class Rough_09 
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = "" + n;
      int count = s.length();
      System.out.println(count + " digits");

      // b 
      count = s.length();
      int[] digits = new int[count];
        
      // Extract digits and store in array
      int tempNumber = n;
      for (int i = count - 1; i >= 0; i--) {
          digits[i] = tempNumber % 10;
          tempNumber /= 10;
      }
      
      // Encrypt each digit by multiplying by 7 and print the result
      for (int i = 0; i < count; i++) {
          System.out.print(digits[i] * 7 + " ");
      }
      sc.close(); 
    } 
}