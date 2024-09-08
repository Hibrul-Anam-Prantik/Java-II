package Practice.ProblemSolving;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roman Sign: ");
        String roman = sc.nextLine();  
        /*    Symbol        Value
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000      */
        sc.close();
        Convert r2i = new Convert();
        int num = r2i.romanToInt(roman);
        System.out.println(num);
    }
}

class Convert {
    public int romanToInt(String s) {
        int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;
        int sum = 0;
        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == 'I') {
                sum += i;
            } else if(s.charAt(j) == 'V') {
                if(j > 0 && s.charAt(j - 1) == 'I') {
                    sum += (v - 2*i);
                } else {
                    sum += v;
                }
            } else if(s.charAt(j) == 'X') {
                if(j > 0 && s.charAt(j - 1) == 'I') {
                    sum += (x - 2*i);
                } else {
                    sum += x;
                }
                
            } else if(s.charAt(j) == 'L') {
                if(j > 0 && s.charAt(j - 1) == 'X') {
                    sum +=+ (l - 2*x);
                } else {
                    sum += l;
                }
                
            } else if(s.charAt(j) == 'C') {
                if(j > 0 && s.charAt(j - 1) == 'X') {
                    sum += (c - 2*x);
                } else {
                    sum += c;
                }
                
            } else if(s.charAt(j) == 'D') {
                if(j > 0 && s.charAt(j - 1) == 'C') {
                    sum += (d - 2*c);
                } else {
                    sum += d;
                }
                
            } else if(s.charAt(j) == 'M') {
                if(j > 0 && s.charAt(j - 1) == 'C') {
                    sum += (m - 2*c);
                } else {
                    sum += m;
                }
                
            }
        }
        return sum;
    }
}
